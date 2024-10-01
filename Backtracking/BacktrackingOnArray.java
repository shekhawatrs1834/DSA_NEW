import java.util.*;

public class BacktrackingOnArray {
    public static void changeArray(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArray(arr);
            System.out.println();
            return;
        }

        //recursion(kaam)
        arr[i]=val;                 //assigning value
        changeArray(arr, i+1, val+1);         //recursive step
        arr[i]=arr[i]-2;    //backtracking step

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}
