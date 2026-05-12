import java.util.ArrayList;

public class NQueens {

    // Print Board
    static void print(ArrayList<ArrayList<Character>> board) {

        int n = board.size();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(board.get(i).get(j) + " ");
            }

            System.out.println();
        }

        System.out.println("--------------------");
    }

    // Check Safe Position
    static boolean isSafe(ArrayList<ArrayList<Character>> board,
                          int row,
                          int col) {

        int n = board.size();

        // Horizontal Check
        for(int i = 0; i < n; i++) {

            if(board.get(row).get(i) == 'Q') {
                return false;
            }
        }

        // Vertical Check
        for(int i = 0; i <= row; i++) {

            if(board.get(i).get(col) == 'Q') {
                return false;
            }
        }

        // Left Diagonal Check
        for(int i = row, j = col;
            i >= 0 && j >= 0;
            i--, j--) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        // Right Diagonal Check
        for(int i = row, j = col;
            i >= 0 && j < n;
            i--, j++) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Backtracking Function
    static void nQueens(ArrayList<ArrayList<Character>> board,
                        int row) {

        int n = board.size();

        // Base Case
        if(row == n) {

            print(board);
            return;
        }

        // Try Every Column
        for(int col = 0; col < n; col++) {

            // Safe Check
            if(isSafe(board, row, col)) {

                // Place Queen
                board.get(row).set(col, 'Q');

                // Recursive Call
                nQueens(board, row + 1);

                // Backtracking
                board.get(row).set(col, '.');
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;

        ArrayList<ArrayList<Character>> board =
                new ArrayList<>();

        // Create Board
        for(int i = 0; i < n; i++) {

            ArrayList<Character> newRow =
                    new ArrayList<>();

            for(int j = 0; j < n; j++) {

                newRow.add('.');
            }

            board.add(newRow);
        }

        // Start Recursion
        nQueens(board, 0);
    }
}




/*
N-Queens Problem

Time Complexity (TC) :
O(N!)

Why?
- For each row, we try placing a queen in every column.
- Row 1 -> N choices
- Row 2 -> N-1 choices
- Row 3 -> N-2 choices
- ...
- Total possibilities:
      N * (N-1) * (N-2) * ...
    = N!

- Also, isSafe() checks row, column, and diagonals,
  which takes O(N) time.

So practical complexity becomes:
    O(N * N!)

But usually written as:
    O(N!)


Space Complexity (SC) :
O(N^2)

Why?
1. Chess board storage:
      N x N board
   => O(N^2)

2. Recursive call stack:
      maximum depth = N
   => O(N)

Total:
    O(N^2)
because board space dominates recursion stack.


Backtracking Meaning:
- Place queen
- Check safe or not
- If wrong:
      remove queen
      try another position

This undo process is called Backtracking.
*/