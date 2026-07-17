import java.util.*;
public class Factorial3{
    public static int sum(int n){
        if(n==1)
            return 1;
            return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sum(n));
    }
}