import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int left=0;
        int right=n-1;
        boolean isPalindrome=true;
        for(int i=0;i<n;i++){
            if(arr[left] != arr[right]){
                isPalindrome=false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}