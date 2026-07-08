import java.util.*;
public class AverageEveryWindow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
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
        System.out.println((double) sum/k);
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            //    System.out.println((double) sum/k);
        }
        System.out.println((double) sum/k);
    }
}