package module_21;

public class Rat_Maze {
    static int N;
    void print_Solution(int[][] sol){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    boolean isSafe(int maze[][],int row,int col){
        if(row>=0 && row<N && col>=0 && col<N && maze[row][col]==1){
            return true;

        }
        return false;
    }
    boolean sloveMzeUtil(int maze[][],int row,int col,int sol[][]){
        //Base
        if(row==N-1 && col ==N-1 && maze[row][col] == 1){
            maze[row][col] = 1;
            return true;
        }

        if(isSafe(maze,row,col)){

            if(sol[row][col]==1){
                return false;
            }

            sol[row][col] =1;

            if(sloveMzeUtil(maze, row+1, col, sol)){
                return true;
            }
            if(sloveMzeUtil(maze, row, col+1, sol)){
                return true;
            }

            sol[row][col] =0;
            return false;
        }
        return false;
    }

    boolean solve_Maze(int [][] maze){
        int sol[][] = new int[N][N];
        if(sloveMzeUtil(maze,0,0,sol)){
            print_Solution(sol);
            return true;
        }
        System.out.println("Does not exit");
        return false;
    }
    public static void main(String args[]){
        Rat_Maze rat = new Rat_Maze();
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        
        N = maze.length;
        
    }
}
