import java.util.*;

public class Second {                                            //Repeating elements in an array
    public static void RepeatingElements(int arr[],int n){          //Approach2= Sort array , check if arr[i]==arr[i+1], print
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>1){
                System.out.print(i+" ");
            }
        }
    }
    public static void NonRepeating(int arr[],int n){
        Arrays.sort(arr);
        if(arr[0]!=arr[1]){
            System.out.print(arr[0]+" ");
        }
        for(int i=1;i<n-1;i++){
            if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.print(arr[n-1]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,-1,3,4,3,5,0};
        int n=arr.length;

        //RepeatingElements(arr, n);
        NonRepeating(arr, n);

    }
}
