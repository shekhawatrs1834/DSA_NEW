import java.util.*;
public class Problems {

    public static void SpiralMatrix(int matrix[][]){                    //incomplete
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow;i--){
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static int DiagonalSum(int matrix[][]){
        //bruteforce - O(n^2)
        int sum=0;
        
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         //primary diagonal
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         //secondary diagonal
        //         }else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        //optimized approach- O(n)

        for(int i=0;i<matrix.length;i++){
            //primary
            sum+=matrix[i][i];
            //secondary
            if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        //SpiralMatrix(matrix);

       System.out.println(DiagonalSum(matrix)); 
                            
    }
}
