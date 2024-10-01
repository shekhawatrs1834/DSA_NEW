import java.util.*;
public class TCSArray {
    public static void rankElements(int arr[]){
        int arr1[]=arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            // System.out.print(map.get(arr[i])+",");
            if (i == arr.length - 1) {
                System.out.print(map.get(arr[i])); // No comma for the last element
            } else {
                System.out.print(map.get(arr[i]) + ",");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={20, 15 ,26 ,2 ,98, 6};
        rankElements(arr);
    }
}
