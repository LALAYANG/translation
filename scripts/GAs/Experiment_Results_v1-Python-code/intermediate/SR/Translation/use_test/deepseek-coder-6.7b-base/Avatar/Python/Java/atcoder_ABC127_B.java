```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int common_ratio = sc.nextInt();
        int principal = sc.nextInt();
        int x = sc.nextInt();
        outer_loop(0, 223, 1, common_ratio, principal, x);
    }

    public static void outer_loop(int LoopIndexOut, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        inner_loop(2, 12, 1, common_ratio, principal, x);
        outer_loop(LoopIndexOut + step, stop, step, common_ratio, principal, x);
    }

    public static void inner_loop(int i, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        System.out.println(Math.round(Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
        inner_loop(i + step, stop, step, common_ratio, principal, x);
    }
}
```

