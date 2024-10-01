import java.util.*;

public class Advprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[4];
        System.out.print("enter array elements: ");
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        A[3] = sc.nextInt();
        reverse(A);

    }

    public static void reverse(int A[]) {
        for (int i = 0; i < 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - i - 1];
            A[A.length - i - 1] = temp;

        }
         System.out.print("Result is : ");
        for (int j = 0; j < 4; j++) {
            
                   System.out.print(A[j] +" "); 

        }
    }
}
