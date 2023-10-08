package module_21;

public class BackTracking_Queens {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j = col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //dig right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }

    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x'; //Baccktracking step
            }
            
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        int n=4;
        char board[][] = new char[n][n];

        //initialized
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}
