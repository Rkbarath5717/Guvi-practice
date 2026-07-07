import java.util.*;
public class CheckLeftRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.next();
        char b[]=s.toCharArray();
        int left=0;
        int right=b.length-1;
        int count=0;
        while(left<right){
            if(b[left]==b[right]){
                count++;
            }
            left++;
            right--;
        }
        System.out.print(count);
    }
}