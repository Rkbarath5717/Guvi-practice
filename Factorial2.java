import java.util.*;
public class Factorial2 {
    public static void work(int n){
        if(n==0){
            return;
        }
        // System.out.println(n);
        work(n-1);
        System.out.println(n);
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        work(n);
    }
}