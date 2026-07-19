import java.util.*;
public class ValidParanthesis {
    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' || c=='['|| c =='{'){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top=s.pop();
                if((c==')' && top !='(' )||( c==']' && top != '[') || (c=='{' && top !='}')){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if(isBalanced(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}