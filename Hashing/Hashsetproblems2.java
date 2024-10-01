import java.util.*;
public class Hashsetproblems2 {

    public static String getStart(HashMap<String,String> hm){
        HashMap<String,String> revmap=new HashMap<>();             //make a hashmap and interchange the values of key and values in both
        
        for(String key:hm.keySet()){                             //inserting values in reverse hashmap
            revmap.put(hm.get(key),key);
        }
        for(String key:hm.keySet()){                   //checking if the keys in hm is present in reverse hashmap or not 
            if(!revmap.containsKey(key)){                  //the value which is not present in reverse hashmap i.e. "to" value(here it is mumbai) we can't go to mumbai from any other city
                return key;                        //starting point
            }
    }
    return null;
}

    public static int SubarraySum0(int a[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int len=0;

        for(int j=0;j<a.length;j++){
            sum+=a[j];
            if(hm.containsKey(sum)){
                len=Math.max(len,j-hm.get(sum));
            }else{
                hm.put(sum,j);
            }
        }
        return len;
    }

    public static int SubarraySumK(int a1[],int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(0,1);

        for(int j=0;j<a1.length;j++){
            sum+=a1[j];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }else{
                hm.put(sum,hm.getOrDefault(sum,0 )+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // HashMap<String,String> hm=new HashMap<>();
        // hm.put("chennai","bengaluru");
        // hm.put("mumbai","delhi");
        // hm.put("goa","chennai");
        // hm.put("delhi","goa");
        // String start=getStart(hm);  
        // System.out.print(start);
        // for(String key:hm.keySet()){                       //fetching other cities from starting city
        //     System.out.print("-->"+hm.get(start));
        //     start=hm.get(start);                     //changing start city (prvious (to) city will become starting city)
        // }
        
        // int a[]={15,-2,2,-8,1,7,10};
        // System.out.println(SubarraySum0(a));

        int a1[]={10,2,-2,-20,10};
        int k=-10;
        System.out.println(SubarraySumK(a1, k));

    }
}

