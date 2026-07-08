import java.util.*;
public class UniqueWindow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(arr[i])){
                int p=map.get(arr[i]);
                map.put(arr[i],p+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map.size());

        for(int i=k;i<n;i++){
            if(map.containsKey(arr[i])){
                int p=map.get(arr[i]);
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],1);
            }
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
        }
        System.out.println(map.size());
    }
}