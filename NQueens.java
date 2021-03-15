package Recursion;

import java.util.Arrays;

public class NQueens{
    static char board[][];
    static int n = 15;
    static boolean colUsed[];
    static int whichCol[]; // whichCol[row]: Which column the queen at row is located in.

    public static boolean diagonalFine(int row, int col){
        for(int previousRow = 0; previousRow < row; previousRow++){
            int previousCol = whichCol[previousRow];
            if(Math.abs(previousRow - row) == Math.abs(previousCol - col)) return false;
        }
        return true;
    }

    public static void recurse(int row){
        if(row == n){
            for(char[] rows : board)
                System.out.println(Arrays.toString(rows));
            System.out.println("-----");
            return;
        }
        for(int col = 0; col < n; col++){
            if(colUsed[col] == false && diagonalFine(row, col)){
                board[row][col] = 'Q';
                colUsed[col] = true;
                whichCol[row] = col;
                recurse(row + 1);
                board[row][col] = '.';
                colUsed[col] = false;
            }
        }
    }
    public static void main(String[] args) {
        board = new char[n][n];
        colUsed = new boolean[n];
        whichCol = new int[n];
        for(char[] row : board)
            Arrays.fill(row, '.');
        recurse(0);
    }
}