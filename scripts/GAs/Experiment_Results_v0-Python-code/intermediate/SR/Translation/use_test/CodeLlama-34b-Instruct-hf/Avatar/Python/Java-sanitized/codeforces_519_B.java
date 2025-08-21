import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbersA = new int[n];
        for (int i = 0; i < n; i++) {
            numbersA[i] = scanner.nextInt();
        }
        int[] numbersB = new int[n];
        for (int i = 0; i < n; i++) {
            numbersB[i] = scanner.nextInt();
        }
        int[] numbersC = new int[n];
        for (int i = 0; i < n; i++) {
            numbersC[i] = scanner.nextInt();
        }

        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            x += numbersA[i];
        }

        for (int i = 0; i < n; i++) {
            y += numbersB[i];
        }

        for (int i = 0; i < n; i++) {
            z += numbersC[i];
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}