import java.util.*;
public class Operations {
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at: "+i+","+j);
                }
            }  
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];

        //input
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}
