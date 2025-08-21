import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            B[i] = scanner.nextInt();
        }
        TTest ttest = new TTest();
        double tStatistic = ttest.t(A, B);
        double pValue = ttest.p(A, B);
        System.out.println("t-statistic: " + tStatistic);
        System.out.println("p-value: " + pValue);
    }
}