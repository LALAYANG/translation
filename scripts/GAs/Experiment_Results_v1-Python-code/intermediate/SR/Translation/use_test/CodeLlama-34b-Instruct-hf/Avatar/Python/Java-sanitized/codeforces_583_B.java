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

            int i = 0;
            int stop = n;
            int step = 1;
            while (i < n) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    break;
                }
                if (firstCondition & secondCondition) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
                i += step;
            }
            a = reverse(a);
        }
        System.out.println(gameTurns);
    }

    public static int[] reverse(int[] a) {
        int[] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - i - 1];
        }
        return reversed;
    }
}