import java.util.*;
public class BinarySearch {
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
                answer=mid;
                break;
            }
            else if(arr[mid]<target){
                left=left+1;
            }
            else{
                right=right-1;
            }
        }
        System.out.println(answer);
    }
}