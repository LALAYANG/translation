import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int startColumn = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][startColumn] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = startColumn; j <= D; j++) {
                int aboveValue = d[i][j - 1];
                int leftValue = d[i - 1][j];
                int diagonalValue = d[i - 1][j - 1];
                int currentRow = d[i][j];
                int rowAbove = d[i - 1][j];
                int prevRow = d[i - 1][j];
                int constantOne = 1;
                int constantTwo = 1;
                d[i][j] += calculateMatrixValue(i, m, j, constantOne, diagonalValue, constantTwo, leftValue, aboveValue);
            }
        }
        System.out.println(d[C][D]);
    }

    public static int calculateMatrixValue(int i, int m, int j, int constantOne, int diagonalValue, int constantTwo, int leftValue, int aboveValue) {
        return (aboveValue * i + leftValue * j - diagonalValue * (i - constantTwo) * (j - constantOne)) % m;
    }
}