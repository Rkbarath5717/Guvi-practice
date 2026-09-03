import java.util.*;
public class Many {

    static void checkAge(int age) throws java.lang.Exception{
        if(age < 18){
            throw new java.lang.Exception("This is not correct default is print");
        }
        System.out.println(age);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age=scn.nextInt();
        try{
            checkAge(age);
        }
        catch (java.lang.Exception m){
            System.out.println(18);
            System.out.println(m.getMessage());
        }
    }
}