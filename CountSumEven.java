import java.util.*;
public class CountSumEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum %2 == 0){
            count++;
        }
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum %2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}