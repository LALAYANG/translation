import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        long m = 998244353;
        long[][] d = new long[C + 1][D + 1];
        d[A][B] = 1;
        for (int row = A; row <= C; row++) {
            for (int j = B; j <= D; j++) {
                long currRowPrevColVal = d[row][j - 1];
                long prevRowVal = d[row - 1][j];
                long prevRowPrevColVal = d[row - 1][j - 1];
                d[row][j] += calculateValue(1, j, m, row, currRowPrevColVal, 1, prevRowVal, prevRowPrevColVal);
            }
        }
        System.out.println(d[C][D]);
    }

    @FunctionalInterface
    interface MyDecorator {
        long apply(int rowIdx, int j, long m, int row, long currRowPrevColVal, int colIdx, long prevRowVal, long prevRowPrevColVal);
    }

    public static long calculateValue(int rowIdx, int j, long m, int row, long currRowPrevColVal, int colIdx, long prevRowVal, long prevRowPrevColVal) {
        MyDecorator decorator = (r, c, mm, ro, curr, col, prev, prevPrev) -> (curr * ro + prev * c - prevPrev * (ro - r) * (c - col)) % mm;
        return decorator.apply(rowIdx, j, m, row, currRowPrevColVal, colIdx, prevRowVal, prevRowPrevColVal);
    }
}