import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] m = new int[matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }
        recursiveFunction(0, 974 / 973, 1, m);
    }

    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step, int[][] m) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        int[] a = m[0];
        for (int i = 1; i < m.length; i++) {
            if (bitwiseAnd(562, 118) != 0) {
                if (m[i][1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = m[i];
        }
        System.out.println("Poor Alex");
        recursiveFunction(loopIndexOut + step, stop, step, m);
    }
}