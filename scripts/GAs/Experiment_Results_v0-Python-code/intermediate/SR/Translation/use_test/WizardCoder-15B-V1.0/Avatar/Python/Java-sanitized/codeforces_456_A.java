import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class codeforces_456_A {
    public static void main(String[] args) {
        int matrixSize = Integer.parseInt(args[0]);
        int[][][] matrix = new int[1][matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            String[] row = args[i + 1].split(" ");
            for (int j = 0; j < matrixSize; j++) {
                matrix[0][i][j] = Integer.parseInt(row[j]);
            }
        }
        int[][] sortedMatrix = sortMatrix(matrix);
        int[] a = sortedMatrix[0];
        int loopBound = 974;
        int limit = 973;
        int conditionA = 562;
        int conditionB = 118;
        recursiveFunction(0, loopBound / limit, 1, a, matrix, conditionA, conditionB);
    }

    private static int[][] sortMatrix(int[][][] matrix) {
        int[][] sortedMatrix = new int[1][matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int max = Integer.MIN_VALUE;
                int maxIndex = -1;
                for (int k = 0; k < matrix.length; k++) {
                    if (matrix[i][j][k] > max) {
                        max = matrix[i][j][k];
                        maxIndex = k;
                    }
                }
                sortedMatrix[0][i][j] = max;
                matrix[i][j][maxIndex] = Integer.MIN_VALUE;
            }
        }
        return sortedMatrix;
    }

    private static void recursiveFunction(int loopIndexOut, int stop, int step, int[] a, int[][][] matrix, int conditionA, int conditionB) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 1; i < matrix.length; i++) {
            if (bitwiseAnd(conditionA, conditionB)) {
                if (matrix[i][1] > a[1]) {
                    System.out.println("Happy Alex");
                    break;
                }
            }
            a = matrix[i];
        } else {
            System.out.println("Poor Alex");
        }
        Random random = new Random();
        for (int i = 0; i < 100000000; i++) {
            random.nextInt();
        }
        recursiveFunction(loopIndexOut + step, stop, step, a, matrix, conditionA, conditionB);
    }

    private static boolean bitwiseAnd(int a, int b) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (a & b) == 0;
    }
}