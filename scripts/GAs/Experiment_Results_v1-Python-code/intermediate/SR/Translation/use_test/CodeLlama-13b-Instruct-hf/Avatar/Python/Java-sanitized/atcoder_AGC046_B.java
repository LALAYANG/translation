import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;
        for (int row = A; row <= C; row++) {
            for (int j = B; j <= D; j++) {
                int currRowPrevColVal = d[row][j - 1];
                int prevRowVal = d[row - 1][j];
                int prevRowPrevColVal = d[row - 1][j - 1];
                int currRow = d[row];
                int prevRow = d[row - 1];
                int colIdx = 1;
                int rowIdx = 1;
                d[row][j] += calculateValue(rowIdx, j, m, row, currRowPrevColVal, colIdx, prevRowVal, prevRowPrevColVal);
            }
        }
        System.out.println(d[C][D]);
    }

    public static int calculateValue(int rowIdx, int j, int m, int row, int currRowPrevColVal, int colIdx, int prevRowVal, int prevRowPrevColVal) {
        return (currRowPrevColVal * row + prevRowVal * j - prevRowPrevColVal * (row - rowIdx) * (j - colIdx)) % m;
    }
}