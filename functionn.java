import java.util.*;
import java.math.MathContext;
public class functionn {
    /*public static int calculatesum(int num1,int num2){
        int sum= num1+ num2;
        return sum;
       

    }
    public static void main(String args[]){   //sum
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=calculatesum(a,b);
        System.out.print(sum);

    }
    
}
public static int calculateprod(int a,int b){
int prod= a*b;

return prod;

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);                    //product of 2 no
System.out.print("enter first no.: ");
int a = sc.nextInt();
System.out.print("enter second no.: ");
int b = sc.nextInt();
int prod= calculateprod(a,b);
System.out.println("the product of 2 numbers is: " +prod);
}
}*/

/*public static int factorial(int n){
    int f=1;

    for(int i=1;i<=n;i++){
        f=f*i;                             //factorial
        
    }
    return f;
    
    
}
/*public static void main(String args[]) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number: ");
    int n= sc.nextInt();
    System.out.print(factorial(n));
   
public static int bincoef(int n, int r){
    int factn=factorial(n);                            //factorial function also used
    int factr=factorial(r);                          //binomial coefficient
    int factnmr=factorial(n-r);
    int bincoef=factn/(factr*factnmr);
    return bincoef;
} 

public static void main(String args[]){
    System.out.print(bincoef(5,2));
}   
}*/ 

/*public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
   
    for(int i=2;i<=n-1;i++){    // for more optimization use for(int i=2;i<=Math.sqrt(n);i++)
        if(n%i==0)                                    //prime or not
        return false;
    }
    return true;
}
/*public static void main(String args[]){
    System.out.print(isPrime(2));
}
public static void primesinRange(int n){
    for( int i=2;i<=n;i++){
       if( isPrime(i)){
        System.out.print(i+ " ");                //find prime no. in a given range
       }
    }
}
public static void main(String args[]){
    primesinRange(10);
}
}
public static void BtD(int n){
    int pow=0;
    int decN=0;
    while(n>0){
        int lastdigit=n%10;                        //binary to decimal conversion
        decN=decN +(lastdigit*(int)Math.pow(2,pow));
        pow++;
        n=n/10;
    }
    System.out.print(decN);

}
public static void main(String args[]){
    BtD(101);

}
}*/
public static void DtB(int n){
    int pow=0;
    int BinN=0;
    while(n>0){
        int r=n%2;
        BinN=BinN+(r*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.print(BinN);
}
public static void main(String args[]){
    DtB(7);

}
}
 
