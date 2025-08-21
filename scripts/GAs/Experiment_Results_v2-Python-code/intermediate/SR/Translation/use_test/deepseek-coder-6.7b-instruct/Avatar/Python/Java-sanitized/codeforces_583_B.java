import java.util.*;
import java.util.stream.*;

public class codeforces_583_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getTurns(a));
    }

    private static int getTurns(int[] a) {
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            a = IntStream.range(0, a.length).map(i -> a[a.length - i - 1]).toArray();
        }
        return counterTurns;
    }
}