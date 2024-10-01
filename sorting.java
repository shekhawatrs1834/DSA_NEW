import java.util.Arrays;
import java.util.Collections;
public class sorting {
    public static void bubblesort(int a[]){        //bubblesort-we compare adjacent terms , the largest one we keep shifting right hand side
        for(int turn=0;turn<a.length-1;turn++){    //we will be having n-1 turns in total(0th,1st,2nd,3rd) to get sorted array
                                                   //in 0th turn we are comparing and sorting n-1(last) and (n-2)second last terms so we are iterating from 0 to <n-1
            for(int j=0;j<a.length-1-turn;j++){    //in every turn we are subtracting the value of turn bcoz now we have to sort upto n-3(1st turn),n-4(2nd turn) bcoz the last terms are already getting sorted in 0th turn
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];                  //swap
                    a[j+1]=temp;

                }
            }
        }

    }
    public static void selectionsort(int a[]){         //selection sort= we find the min value and put it at the beginning
        for(int i=0;i<a.length-1;i++){
            int minPos=i;                           //we are assuming the current elemet to be the smallest and then comparing in the 2nd loop, and if we find smallest value than this we will update the minpos
            for(int j=i+1;j<=a.length-1;j++){    //for comparison part we will iterate upto last term that is n-1 and for min value we will got upto 2nd last term bcoz last will automatically be the largest
                if(a[minPos]>a[j])               //we can change operator sign to make it in descending order whenevr we want
                minPos=j;
            }
            //swapping 
            int temp=a[minPos];       // minpos - we got the smallest value in array
            a[minPos]=a[i];
            a[i]=temp;              //a[i] means for which index in array we are calculating the smallest value basically turn like oth index , 1st index .... 
        }
    }
    public static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){          
            int cur=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>cur){           //if previous element is greater than the current ele , we shift the previous by one
                a[prev+1]=a[prev];                   //invert the enequality condition to make it into descending order
                prev--;                              //we keep decrementing the prev pointer and keep comparing with the cur and keep shifting the greater one until we find the suitable place to insert cur
            }
            a[prev+1]=cur;                           //here our prev value is less than cur but previous is decremented as we come out of the loop so we will increment the prev and then store the cur value there
        }
    }
    public static void main(String args[]){
        Integer a[]={5,4,1,3,2};
        //selectionsort(a);
        //bubblesort(a);
        //insertionsort(a);
       // Arrays.sort(a);                                        //inbuilt sorting function in java
      // Arrays.sort(a,1,4);                                    //only sort some specific part of array
      Arrays.sort(a, Collections.reverseOrder());                //descending order - only works with object variable linke Integer not with primitive(int)
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}

//Time complexity= O(n^2) for all