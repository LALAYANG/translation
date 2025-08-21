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
        int counter = 0;
        int gameTurns = -1;
        while (counter < n) {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            for (int i = 0; i < n; i++) {
                if (firstCondition & secondCondition) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] != -1) {
                    a[i] = -1;
                }
            }
        }
        System.out.println(gameTurns);
    }
}