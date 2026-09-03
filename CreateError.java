import java.util.*;
public class CreateError {

    static class BarathException extends java.lang.Exception{
        BarathException(String message){
            super(message);
        }
    }

    static void countStack(int stack) throws BarathException{
        if(stack <=0){
            throw new BarathException("Stack count is must be larger");
        }
        System.out.println(stack + "Stack is purchased");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int stack=scn.nextInt();
        try{
            countStack(stack);
        }
        catch(BarathException e){
            System.out.println(e.getMessage());
        }

    }
}