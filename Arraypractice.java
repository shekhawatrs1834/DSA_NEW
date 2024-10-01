import java.util.*;
public class Arraypractice {
    /*public static boolean repeatingno(int numbers[]){
        int temp=0;
        for(int i=0;i<numbers.length;i++){
            temp=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(temp==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,0,1,1};
        System.out.println(repeatingno(numbers));
    }*/
   
    public static int tripletno(int num[]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            int num1=num[i];
            for(int j=i+1;j<num.length;j++){
                int num2=num[j];

                for(int k=j+1;k<num.length;k++){
                    int num3=num[k];
                    if(sum[i]+sum[j]+sum[k]==0)

                }
            }
        }
        System.out.print("[" +num1 ","+num2 ","+num3 "]");
    }
    public static void main(String args[]){
        int num[]={-1,0,1,2,-1,-4};
        tripletno(num);
}
}
