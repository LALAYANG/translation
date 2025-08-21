import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            x[i] = scanner.nextInt();
        }

        int m = 0;
        int q = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (x[i] - x[i + 1]) / divisor + 1;
                m = m + q;
                x[i + 1] = x[i + 1] + q * divisor;
            }
        }

        System.out.println(m);
    }
}