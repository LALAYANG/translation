```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] list_a = new int[n];
        for (int i = 0; i < n; i++) {
            list_a[i] = scanner.nextInt();
        }
        int[] list_b = new int[a];
        for (int i = 0; i < a; i++) {
            list_b[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;

        for (int LoopIndexOut = 0; LoopIndexOut <= LOOP_START / LOOP_END; LoopIndexOut++) {
            recursivePrint(0, n, 1);
        }
    }

    public static void recursivePrint(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (k + 1 < list_a.length) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursivePrint(k + step, stop, step);
    }
}
```

Test input:
4 3 1
1 2 4
3

Expected output:
1 1 2 1 
