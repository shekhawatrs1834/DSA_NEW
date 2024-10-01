import java.util.*;
public class Sudoku {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //vertical
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){                    //col remain same , iterate over all rows 
                return false;
            }
        }
        //horizontal                         
        for(int j=0;j<9;j++){                             //row remain same , iterate over all the cols
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int startingrow=(row/3)*3;
        int startingcol=(col/3)*3;
        for(int i=startingrow;i<startingrow+3;i++){
            for(int j=startingcol;j<startingcol+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean Sudoku1(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }

        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(nextcol==9){                        //jab saare column hojaenge tb new row pr shift ho jaenge
            nextrow=row+1;
            nextcol=0;                               //column frse 0 se start hojaegi
        }
        if(sudoku[row][col]!=0){                            //agr sudoku mein phle se value hogi koi toh next cell pr move kr jaenge
            return Sudoku1(sudoku, nextrow, nextcol);
        }
            for(int digit=1;digit<=9;digit++){
                if(isSafe(sudoku,row,col,digit)){
                    sudoku[row][col]=digit;
                    if(Sudoku1(sudoku, nextrow, nextcol)){
                        return true;
                    }
                    sudoku[row][col]=0;
                }
            }
        
        return false;
    }
    public static void PrintSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        
        if(Sudoku1(sudoku, 0, 0)){
            System.out.println("Solution exists");
            PrintSudoku(sudoku);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}
