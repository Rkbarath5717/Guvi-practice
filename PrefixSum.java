import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        System.out.println(Arrays.toString(prefix));

    }
}