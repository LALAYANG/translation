import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        int[] W = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            W[i] = scanner.nextInt();
        }
        int[] sum_el = new int[arraySize + 1];
        sum_el[0] = 0;

        for (int i = 1; i <= arraySize; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }

        int answer = QR * (arraySize - 1) + sum_el[arraySize] * R;
        int outerLoopCount = 955;
        int outerLoopLimit = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i <= arraySize; i++) {
                int energy = L * sum_el[i] + R * (sum_el[arraySize] - sum_el[i]);
                if (i > arraySize - i) {
                    energy = energy + (i - (arraySize - i) - 1) * QL;
                } else if (arraySize - i > i) {
                    energy = energy + (arraySize - i - i - 1) * QR;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}