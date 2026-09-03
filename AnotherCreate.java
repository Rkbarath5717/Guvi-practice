import java.util.*;
public class AnotherCreate {

    static class VickyException extends java.lang.Exception{
        VickyException(String message){
            super(message);
        }
    }
    static void buyBook(int book,Scanner scn) throws VickyException{
        if(book <=0){
            throw new VickyException(" Books count is minimum 1 ");
        }
        System.out.println("Enter the amount : " );
        int amount=scn.nextInt();
        System.out.println("Amount is received and book purched");
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int book=scn.nextInt();
        try{
            buyBook(book,scn);
        }
        catch(VickyException e){
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}