import java.util.*;
public class RecursionBasics {
    public static void main(String[] args) {
        //int n=5;
        //printdec(n);
        //printinc(n);
        //System.out.println(factorial(n));
        //System.out.println(Sum(n));
        //System.out.println(Fibonacci(n));
        int arr[]={1,2,5,6,4,7,5};
        int i=0;
        //System.out.println(isSorted(arr, i));
        int key=5;
        //System.out.println(Firstoccurence(arr,key,i));
        //System.out.println(Lastoccurence(arr, key, i));
        int x=2;
        int n=10;
        System.out.println(Power(x, n));
    }

    // public static void printdec(int n){           //decreasing numbers using recursion
    //     if(n==1){                                   //base case
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printdec(n-1);
    // }

//     public static void printinc(int n){            //increasing
//         if(n==30){
//             System.out.println(30);
//             return;
//         }
//         System.out.print(n+" ");
//         printinc(n+1);
    
// }

    // public static int factorial(int n){          //factorial of a number
    //     if(n==0){
    //         return 1;
    //     }
        
        
    //     return n*factorial(n-1);
    
    // }

    // public static int Sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
        
    //     return n+Sum(n-1);
    // }

    // public static int Fibonacci(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    
    //      return Fibonacci(n-1)+Fibonacci( n-2);
    // }


    // public static boolean isSorted(int arr[],int i){       //checking if array is sorted or not
    //     if(i==arr.length-1){
    //         return true;
    //     }
    //     if(arr[i]<=arr[i+1]){
    //         return isSorted(arr, i+1);
           
    //     }
    //      return false; 
    // }

    
    // public static int Firstoccurence(int arr[],int key,int i){
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     if(i==arr.length){
    //         return -1;
    //     }
        
    //     return Firstoccurence(arr, key, i+1 );
    // }

//     public static int Lastoccurence(int arr[],int key,int i){
//          if(i==arr.length){
//             return -1;
//          }
//         int isFound=Lastoccurence(arr, key, i+1);
//         if(isFound==-1 && arr[i]==key){
//             return i;
//         }

//         return isFound;
        
        
        
// }


    // public static int Power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     return x*Power(x, n-1);
    // }

    public static int Power(int x,int n){             //optimized (O(logn))
        if(n==0){
            return 1;
        }

        if(n%2==0){
            return Power(x,n/2)*Power(x, n/2);
        }
        return x*Power(x, n/2)*Power(x, n/2);
        
    }

}