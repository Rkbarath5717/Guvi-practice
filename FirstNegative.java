import java.util.*;
public class FirstNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        for(int i=0;i<=n-k;i++){
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.println(arr[j]);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("no");
            }
        }
    }
}