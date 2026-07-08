import java.util.*;
public class SlidingWindow_subarraysum {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
        }
        if(sum>max){
            max=sum;
        }
        System.out.print(max);
    }
}