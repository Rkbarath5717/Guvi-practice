import java.util.*;
public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            s.push(c);
        }
        System.out.println("Reverse String : ");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}