import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int startColumn = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        for (int i = 0; i < C + 1; i++) {
            for (int j = 0; j < D + 1; j++) {
                d[i][j] = 0;
            }
        }
        d[A][startColumn] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = startColumn; j <= D; j++) {
                int aboveValue = d[i][j - 1];
                int leftValue = d[i - 1][j];
                int diagonalValue = d[i - 1][j - 1];
                int currentRow = d[i];
                int rowAbove = d[i - 1];
                int prevRow = d[i - 1];
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