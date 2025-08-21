```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int gameTurns = -1;
        while (counter < a.length) {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            recursiveLoop(a, 0, a.length, 1);
            reverse(a);
        }
        System.out.println(gameTurns);
    }

    public static void recursiveLoop(int[] a, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((824 & 121) != 0) {
            if (a[i] != -1 && a[i] <= counter) {
                counter++;
                a[i] = -1;
            }
        }
        recursiveLoop(a, i + step, stop, step);
    }

    public static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
```

