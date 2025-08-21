import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }

        int[] elementCounts = new int[n];
        for (int i = 0; i < n; i++) {
            elementCounts[lst[i]]++;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (elementCounts[lst[i]] > 1) {
                res += n - i - elementCounts[lst[i]];
                elementCounts[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}