import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(map.containsKey(c)){
                int p=map.get(c);
                map.put(c,p+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(int i=0;i<s2.length();i++){
            char c =s2.charAt(i);
            if(!map.containsKey(c)){
                System.out.println("Not an Anagram");
                return;
            }
            int count=map.get(c);
            if(count==1){
                map.remove(c);
            }
            else{
                map.put(c,count-1);
            }
        }
        if(map.isEmpty()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
        
    }
}