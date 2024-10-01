import java.util.*;
public class Gridways {
    public static int GridWays(int i,int j,int n,int m){                        //exponential time
        //base case
        if(i==n-1 && j==m-1){             // when on the lase cell , there is always one way
            return 1;
        }else if(i==n || j==m){            //boundary cross condition
            return 0;
        }
        int w1=GridWays(i, j+1, n, m);
        int w2=GridWays(i+1, j, n, m);
        return w1+w2;
    }
    public static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    public static int Gridways1(int n,int m){               // linear time - using permutation 
        int p=fact(n-1);
        int q=fact(m-1);
        int r=fact(n-1+m-1);
        return r/(p*q);
    }
    public static void main(String[] args) {
        int n=3,m=3;
        //System.out.println(GridWays(0, 0, n,m));
        System.out.println(Gridways1(n, m));
        System.out.println(fact(2));
    }
}
