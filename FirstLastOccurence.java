import java.util.*;
public class FirstLastOccurence {
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
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=0;
        right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}