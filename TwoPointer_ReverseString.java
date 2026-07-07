import java.util.*;
public class TwoPointer_ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.next();
        char b[]=s.toCharArray();
        int left=0;
        int right=b.length-1;
        while(left<right){
            char temp=b[left];
            b[left]=b[right];
            b[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(b));
    }
}