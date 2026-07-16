import java.util.*;
public class FirstRepeating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                int p = map.get(c);
                map.put(c,p+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(map.get(c)>1){
                System.out.println(c+"->"+map.get(c));
                return;
            }
        }
        System.out.println("No element found");
    }
}