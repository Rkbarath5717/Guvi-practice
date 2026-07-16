import java.util.*;
public class HashUserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int n = scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++){
            String s=scn.nextLine();
            int m=scn.nextInt();
            scn.nextLine();
            map.put(s,m);
        }
        System.out.println(map);
    }
}