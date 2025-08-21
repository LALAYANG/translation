import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numQueries = scanner.nextInt();
        int[] sa = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            sa[i] = scanner.nextInt();
        }
        int[] ss = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            int valueA = scanner.nextInt();
            int b = scanner.nextInt();
            ss[i] = calculate(valueA, b);
        }
        System.out.println(Arrays.toString(ss));
    }

    private static int calculate(int valueA, int b) {
        return b - valueA;
    }
}