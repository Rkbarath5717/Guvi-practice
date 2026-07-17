import java.util.*;
public class Factorial1{
    public static void number(int n){
        if(n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        number(n);
    }
}