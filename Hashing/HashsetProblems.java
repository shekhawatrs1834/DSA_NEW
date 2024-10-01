import java.util.*;
public class HashsetProblems {
    public static int countDistinctElements(int num[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<num.length;i++){
            hs.add(num[i]);
        }
        return hs.size();
    }
    public static void UnionIntersection(int a[],int b[]){
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        System.out.println("union: "+hs.size());
        // for(Integer n:hs){
        //     System.out.print(n+",");              //for printing elements
        // }
        // System.out.println();
        hs.clear();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(hs.contains(b[i])){
                count++;
               // System.out.print((b[i])+","); 
                hs.remove(b[i]);
            }
        }
        System.out.println("intersection: "+count);
        
    }
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        //System.out.println(countDistinctElements(num));

        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};
        UnionIntersection(a, b);

    }
}
