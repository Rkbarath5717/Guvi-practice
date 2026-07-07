import java.util.*;
public class OrderSquare{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int result[]=new int[arr.length];
        int left =0;
        int right=arr.length-1;
        int index=arr.length-1;
        while(left<=right){
            int leftSquare=arr[left]*arr[left];
            int rightSquare=arr[right]*arr[right];
        if(leftSquare>rightSquare){
            result[index]=leftSquare;
            left++;
        }
        else{
            result[right]=rightSquare;
            right--;
        }
        index--;
        }
        System.out.println(Arrays.toString(result));
    }

}