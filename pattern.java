import java.util.*;
public class pattern {
    public static void main(String args[]) {
       /*  for(int i=1;i<=4;i++){            // star pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
            int n=4;
            for(int i=1;i<=4;i++){
                for(int star=1;star<=n-i+1;star++){   // inverted star pattern
                    System.out.print("*");
                }
                System.out.println();
            }
        }}

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){   // numbers
                System.out.print(j);
            }
            System.out.println();
        }
    }}*/

    int n=4;
    char ch='A';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){   // character pattern
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}}