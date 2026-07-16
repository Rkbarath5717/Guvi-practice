import java.util.*;
public class HashExample{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("barath",200);
        map.put("vignesh",300);
        map.put("sabari",400);
        map.put("sanjay",500);
        map.put("dinesh",600);
        map.put("dhushwanth",700);

        System.out.println(map.put("worker",600));
        System.out.println(map.get("barath"));
        System.out.println(map.containsKey("vignesh"));
        System.out.println(map.containsValue(400));
        System.out.println(map.remove("barath"));
        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.clear();


        // for(Map.Entry<String,Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey());
        //     System.out.println(entry.getValue());
        // }

    }
}