import java.util.*;
public class ArraysCC {
 /*public static void main(String args[]){
    int marks[]=new int[50];
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    marks[2]=marks[2]+2;
    System.out.println("physics: " +marks[0]);
    System.out.println("Maths: " +marks[1]);
    System.out.println("Chemistry: " +marks[2]); 
    System.out.println("length of array: " +marks.length);
}
public static int linearsearch(int n[],int key){
    for(int i=0;i<n.length;i++){
        if(n[i]==key){
            return i;
        }
    
    }
    return -1;
}
public static void main(String args[]) 
{
    int n[]={2,4,6,8,10,12,14,16};
    int key=10;                               //linear search
    int index=linearsearch(n, key);
    if(index==-1){
        System.out.print("Not found");
    }
    else{
        System.out.print("the number is at index: " +index);
    }
}
public static int getLargest(int number[]){
    int largest=Integer.MIN_VALUE; //-infinity
    for(int i=0;i<number.length;i++){
    if(largest<number[i]){
        largest=number[i];
    }
}
    return largest;

}
public static void main(String args[]){
    int number[]={2,5,1,9,6,8,3};
    System.out.println("largest no is: " +getLargest(number));
}
public static int binarySearch(int numbers[], int key){   
    int start=0;
    int end=numbers.length-1;
    
    while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;                            //binary search
        }
        else{
            end=mid-1;
        }

    }
    return -1;

}
public static void main(String args[]) {
    int numbers[]={2,4,6,8,10,12,14};
    int key=10;
    System.out.println("the no is at index: " +binarySearch( numbers));


    
}
public static void reverse(int numbers[]){
    int start=0;
    int end=numbers.length-1;
    while(start<end){
        int temp=numbers[end];
        numbers[end]=numbers[start];                //reverse of an array
        numbers[start]=temp;

        start++;
        end--;
    }
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    reverse(numbers);
    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
}
public static void arraypair(int numbers[]){                 //print array pairs
    for(int i=0;i<numbers.length;i++){
        int curr=numbers[i];
        for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+curr+","+numbers[j]+")");
        }
        System.out.println();
    }
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    arraypair(numbers);
}
public static void subarray(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;                                      //subarrays
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    subarray(numbers);
}
public static void subarraysum(int numbers[]){
    int currsum=0;
    int maxsum= Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;  
            currsum=0;                                   //subarrays sum using brute force
            for(int k=start;k<=end;k++){                   //O(n^3) 3 loops 
                currsum+= numbers[k];
                
            }
            System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
        }
        
    }
    System.out.println(maxsum);
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    subarraysum(numbers);
}
public static void kadanemaxsum(int numbers[]){
    int cs=0;
    int ms=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        cs+=numbers[i];                              //Max sum using kadane's algorithm
                                                      // O(n) time complexity ...only one loop most efficient
        if(cs<0){                                     //whenever encounters -ve value make current sum equal to 0
            cs=0;
            
        }
        ms=Math.max(cs,ms);  

    }
    System.out.println("max sum is: " +ms);
}
public static void main(String args[]){
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    kadanemaxsum(numbers);
}
public static int Trappedrainwater(int height[]){
    int n=height.length;
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
    }
                                                               //trapped rain water find lext maximum and right maximumn take min of two and subtract it with height of bar
    int rightmax[]=new int[n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
    }
    int trappedwater=0;
    for(int i=0;i<n;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
         trappedwater+= waterlevel-height[i];
        
    }
    return trappedwater;
}
public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(Trappedrainwater(height));
}*/
public static int Buyandsellstocks(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);                //best time to buy and sell stocks
        }
        else
        buyprice=prices[i];
    }
    return maxprofit;
}
public static void main(String args[]){
    int prices[]={4,2,0,6,3,2,5};
    System.out.print(Buyandsellstocks(prices));
}
}

/*
 public class Solution {
    public  static void reverse(int A[]){
        
        for(int j=A.length-1;j>=0;j--){
            System.out.print(A[j]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[];
        reverse(A) ;     
    }
 */

 