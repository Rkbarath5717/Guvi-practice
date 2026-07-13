import java.util.*;
public class RotateTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        int left=0;
        int right=n-1;
        int answer=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                answer=target;
                break;
            }
            if(arr[left]<=arr[mid]){
                if(target>=arr[left] && target<arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(target>arr[mid] && target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        System.out.println(answer);
    }
}