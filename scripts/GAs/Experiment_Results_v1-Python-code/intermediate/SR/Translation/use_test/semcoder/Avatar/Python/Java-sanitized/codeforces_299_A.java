import java.util.Arrays;
import java.util.Scanner;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int diff = a[i] - a[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
}