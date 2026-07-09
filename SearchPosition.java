import java.util.*;
public class SearchPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the target: ");
        int p=scn.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==p){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<p){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(left);
    }
}