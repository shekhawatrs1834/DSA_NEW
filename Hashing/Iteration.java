import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("Indonesia",50);
        hm.put("China",10);

        //iteration
        Set<String> keys=hm.keySet();
        for(String k:keys){
            System.out.println("key: "+k+", value: "+hm.get(k));
        }
    }
}
