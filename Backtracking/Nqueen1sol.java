public class Nqueen1sol {
    public static boolean Nqueen(char board[][],int row){
        //base case
        if(row==board.length){
            //Printboard(board);
            count++;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';             //phle ek queen place krdi       
                if(Nqueen(board, row+1)){        // fr ye check krlenge ki n-1(bachi hui queens) k liye possible way h? recursion return krdega true ya false
                    return true;                 //true hua toh print krwa denge 
                }
                board[row][j]='x';                   //else backtrack          
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // for left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Printboard(char board[][]){
        System.out.println("---------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        if(Nqueen(board,0)){
            System.out.println("possible");
            Printboard(board);
        }else{
            System.out.println("not possible");
        }
        //System.out.println("total no. of ways to place: "+count);
    } 
}
