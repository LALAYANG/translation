public class atcoder_AGC046_B {
    public static int calculateValue(int rowIdx, int j, int m, int row, int currRowPrevColVal, int colIdx, int prevRowVal, int prevRowPrevColVal) {
        return (currRowPrevColVal * row + prevRowVal * j - prevRowPrevColVal * (row - rowIdx) * (j - colIdx)) % m;
    }

    public static void main(String[] args) {
        int A = 1, B = 1, C = 3000, D = 3000, m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;

        for (int row = A; row <= C; row++) {
            for (int j = B; j <= D; j++) {
                int currRowPrevColVal = d[row][j - 1];
                int prevRowVal = d[row - 1][j];
                int prevRowPrevColVal = d[row - 1][j - 1];
                int colIdx = 1, rowIdx = 1;

                d[row][j] += calculateValue(rowIdx, j, m, row, currRowPrevColVal, colIdx, prevRowVal, prevRowPrevColVal);
            }
        }

        int[] arr1 = {18, 72, 82};
        int[] arr2 = {25, 86, 94};
        // Perform t-test

        System.out.println(d[C][D]);
    }
}