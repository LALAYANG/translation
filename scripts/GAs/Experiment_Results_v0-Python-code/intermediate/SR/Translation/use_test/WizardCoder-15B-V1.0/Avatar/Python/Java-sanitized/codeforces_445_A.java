import java.util.Arrays;
import java.util.Random;

public class codeforces_445_A {
    public static void main(String[] args) {
        int rowCount = 2;
        int columnCount = 5;
        String[][] board = new String[rowCount][columnCount];
        Random rand = new Random();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                board[i][j] = ".";
            }
        }
        fillCells(board, 0, columnCount - 1, 1, rand);
        printBoard(board);
    }

    public static void fillCells(String[][] board, int start, int end, int step, Random rand) {
        if (start == end) {
            return;
        }
        if (step > 0) {
            for (int i = start; i <= end; i += step) {
                if (board[i / columnCount][i % columnCount].equals(".")) {
                    if (rand.nextBoolean()) {
                        board[i / columnCount][i % columnCount] = "W";
                    } else {
                        board[i / columnCount][i % columnCount] = "B";
                    }
                }
            }
        } else {
            for (int i = start; i >= end; i += step) {
                if (board[i / columnCount][i % columnCount].equals(".")) {
                    if (rand.nextBoolean()) {
                        board[i / columnCount][i % columnCount] = "W";
                    } else {
                        board[i / columnCount][i % columnCount] = "B";
                    }
                }
            }
        }
        fillCells(board, start + step, end, step, rand);
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}