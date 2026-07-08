import java.util.*;
public class NegativeNumberCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println(count);
        for(int i=k;i<n;i++){
            if(arr[i]<0){
                count++;
            }
            if(arr[i-k]<0){
                count--;
            }
             System.out.println(count);
        }
    }
}