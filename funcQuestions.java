import java.util.*;
public class funcQuestions {
    /*public static float Average(float a,float b,float c){
        float avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.print(Average(a,b,c));
    }
   
    public static boolean isEven(int n){
        
        if(n%2==0){
          return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.print(isEven(5));
    }
    public static int palindrome(int n){
        int rev=0;
        int s=n;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
            
        }
        if(rev==s){
            System.out.print("number is palindrome");
        }
        else{
            System.out.print("number is not palindrome");
        }
        return 0;

    }
    public static void main(String args[]){
      palindrome(321);
    }*/
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;

        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.print(digitsum(256));
        
    }
}
