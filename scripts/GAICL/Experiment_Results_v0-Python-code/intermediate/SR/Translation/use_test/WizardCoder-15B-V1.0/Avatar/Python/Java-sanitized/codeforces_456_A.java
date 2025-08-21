import java.util.*;
import java.util.concurrent.TimeUnit;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        int[][][] matrix = new int[1][matrixSize][2];
        for (int i = 0; i < matrixSize; i++) {
            int[] row = new int[2];
            row[0] = sc.nextInt();
            row[1] = sc.nextInt();
            matrix[0][i] = row;
        }
        Arrays.sort(matrix[0], (a, b) -> b[1] - a[1]);
        int[] a = matrix[0][0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;

        for (int i = 0; i < matrixSize; i++) {
            int[] row = matrix[0][i];
            if (row[0] & conditionB == conditionA) {
                if (row[1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = row;
        } else {
            System.out.println("Poor Alex");
        }

        for (int i = 0; i < loopBound; i += limit) {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

        sc.close();
    }
}