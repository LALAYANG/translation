import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int maxDifference = 0;
        for (int i = 0; i < n; i++) {
            int currentValue = scanner.nextInt();
            int t = scanner.nextInt();
            int diff = calculateDiff(initialValue, t, currentValue);
            if (diff > maxDifference) {
                maxDifference = diff;
            }
        }
        System.out.println(initialValue + maxDifference);
    }

    public static int calculateDiff(int initialValue, int t, int currentValue) {
        return t - (initialValue - currentValue);
    }
}