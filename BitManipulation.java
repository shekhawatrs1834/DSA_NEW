import java.util.*;
public class BitManipulation {
    
        //check if no is even or odd
    
    public static void EvenOdd(int n){
        int bitmask=1;

        if((n & bitmask)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

    public static void Getith(int n, int i){             //to get ith bit
        int bitmask=1;
        if((n & (bitmask<<i))==0){
            System.out.println("ith bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }

    public static int Setith(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int Clearith(int n,int i){
        int bitmask=1<<i;
        return n ^ bitmask;
    }

    public static int Updateith(int n,int i,int newbit){
        if(newbit==1){                            //newbit=updated bit in answer .it will be given
            return Setith(n, i);
        }else{
            return Clearith(n, i);
        }
    }

    public static int ClearIbits(int n,int i){
        int bitmask= ~(0)<<i;
        return n & bitmask;
    }

    public static int ClearbitsinRange(int n,int i,int j){
        int a= ~(0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }

    public static boolean isPowerof2(int n){
        return (n & (n-1))==0;
    }

    public static int Countsetbits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n= n>>1;
        }
        return count;
    }

    public static int FastExponentiation(int n, int a){
        int ans=1;

        while(n>0){
            if((n & 1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void Swap2no(int x,int y){         //swapping of 2 numbers without using third variable
        System.out.println(x+","+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+","+y);
    }

                                                            //no. of 1 bits
                                                            //In the original code, n = n >> 1; uses the arithmetic right shift (>>). This fills the leftmost bits with the sign bit
                                                            // (0 for positive, 1 for negative). It may not give the correct result when treating n as an unsigned value.
                                                            // In the updated code, n = n >>> 1; uses the logical right shift (>>>). This fills the leftmost bits with zeros, 
                                                            // regardless of the sign of the number. It ensures that the count of set bits is not affected by the sign bit.

    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n & 1)==1){
                count++;
            }
            n=n>>>1;
        }
        return count;
    }
}

    public static void main(String[] args) {
        //EvenOdd(4);
        //EvenOdd(3);

        //Getith(10,3);

        //System.out.println(Setith(10, 2));


        //System.out.println(Clearith(10, 1));
        //System.out.println(Updateith(10, 2, 1));
        //System.out.println(ClearIbits(15, 2));
        //System.out.println(ClearbitsinRange(10, 2,4));
        //System.out.println(isPowerof2(32));

        //System.out.println(Countsetbits(15));
        //System.out.println(FastExponentiation(3, 5));

        Swap2no(3, 4);


    }
}
