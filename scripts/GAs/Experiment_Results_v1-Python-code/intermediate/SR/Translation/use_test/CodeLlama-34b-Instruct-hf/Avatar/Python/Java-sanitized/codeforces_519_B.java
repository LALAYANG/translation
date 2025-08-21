import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
            arrayB[i] = scanner.nextInt();
            arrayC[i] = scanner.nextInt();
        }

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < n; i++) {
            sumA += arrayA[i];
            sumB += arrayB[i];
            sumC += arrayC[i];
        }

        System.out.println(Math.abs(sumA - sumB));
        System.out.println(Math.abs(sumB - sumC));
    }
}