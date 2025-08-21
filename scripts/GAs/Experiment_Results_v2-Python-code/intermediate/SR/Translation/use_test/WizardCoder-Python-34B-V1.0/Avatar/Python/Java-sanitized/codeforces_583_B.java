import java.util.Arrays;
import java.util.Scanner;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < n) {
            counterTurns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            Arrays.sort(a);
        }
        System.out.println(counterTurns);
    }
}