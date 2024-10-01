import java.util.*;
public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("delhi");
        hs.add("mumbai");
        hs.add("noida");
        hs.add("bengaluru");

        // Using iterator
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //using for each loop
        for(String city:hs){
            System.out.println(city);
        }
    }
}
