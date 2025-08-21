import java.util.Scanner;
import java.util.Random;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currentLevel = 0;
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
            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        }
        System.out.println(counterTurns);
    }
}