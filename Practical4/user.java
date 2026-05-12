import java.util.ArrayList;
import java.util.Scanner;

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

        // Horizontal
        for(int i = 0; i < n; i++) {

            if(board.get(row).get(i) == 'Q') {
                return false;
            }
        }

        // Vertical
        for(int i = 0; i < n; i++) {

            if(board.get(i).get(col) == 'Q') {
                return false;
            }
        }

        // Left Diagonal
        for(int i = row, j = col;
            i >= 0 && j >= 0;
            i--, j--) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        // Right Diagonal
        for(int i = row, j = col;
            i >= 0 && j < n;
            i--, j++) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        // Bottom Left Diagonal
        for(int i = row, j = col;
            i < n && j >= 0;
            i++, j--) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        // Bottom Right Diagonal
        for(int i = row, j = col;
            i < n && j < n;
            i++, j++) {

            if(board.get(i).get(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Backtracking Function

    static void placeQueens(ArrayList<ArrayList<Character>> board,
                            int row,
                            int queensPlaced,
                            int totalQueens) {

        int n = board.size();

        // Required queens placed
        if(queensPlaced == totalQueens) {

            print(board);
            return;
        }

        // Out of rows
        if(row == n) {
            return;
        }

        // Try every column
        for(int col = 0; col < n; col++) {

            if(isSafe(board, row, col)) {

                // Place Queen
                board.get(row).set(col, 'Q');

                // Recursive Call
                placeQueens(board,
                            row + 1,
                            queensPlaced + 1,
                            totalQueens);

                // Backtracking
                board.get(row).set(col, '.');
            }
        }


        // Skip current row
        placeQueens(board,
                    row + 1,
                    queensPlaced,
                    totalQueens);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter board size (N): ");
        int n = sc.nextInt();

        System.out.print("Enter number of queens: ");
        int k = sc.nextInt();

        // Validation
        if(k > n) {

            System.out.println("Queens cannot be greater than board size!");
            return;
        }

        ArrayList<ArrayList<Character>> board =
                new ArrayList<>();

        // Create Board
        for(int i = 0; i < n; i++) {

            ArrayList<Character> row =
                    new ArrayList<>();

            for(int j = 0; j < n; j++) {

                row.add('.');
            }

            board.add(row);
        }

        // Start Backtracking
        placeQueens(board, 0, 0, k);

        sc.close();
    }
}