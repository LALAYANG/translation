import java.util.Arrays;
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
        Arrays.sort(m, (a, b) -> b[1] - a[1]);
        int[] a = m[0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;

        recursiveFunction(0, loopBound / limit, 1, m, a, conditionA, conditionB);
    }

    private static void recursiveFunction(int LoopIndexOut, int stop, int step, int[][] m, int[] a, int conditionA, int conditionB) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int[] i : m) {
            if ((conditionA & conditionB) != 0) {
                if (i[1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
                a = i;
            }
        } else {
            System.out.println("Poor Alex");
        }
        recursiveFunction(LoopIndexOut + step, stop, step, m, a, conditionA, conditionB);
    }
}