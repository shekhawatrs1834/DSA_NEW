import java.util.*;

public class Operations {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("China",10);
        hm.put("US",50);
        System.out.println(hm);

        //get
        System.out.println(hm.get("US"));

        //contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove
        int value=hm.remove("US");
        System.out.println(value);
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
