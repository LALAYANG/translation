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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            x += numbersA[i];
        }

        for (int i = 0; i < n; i++) {
            y += b[i];
        }

        for (int i = 0; i < n; i++) {
            z += c[i];
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}