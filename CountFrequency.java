import java.util.*;
public class CountFrequency {
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
        for(Character key : map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}