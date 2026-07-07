import java.util.*;
public class CountPairSum {
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
        int count=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.print(count);
    }
}