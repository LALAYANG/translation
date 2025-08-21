```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        boolean possible = true;
        int CheckerB = 692;
        int CheckerA = 234;
        int CheckerF = 867;
        int CheckerC = 410;
        int CheckerD = 634;
        int CheckerE = 636;
        for (int element : m) {
            if (CheckerD & CheckerE) {
                if (CheckerF & CheckerC) {
                    if (CheckerB & CheckerA) {
                        if (Arrays.stream(m).filter(x -> x == element).count() >= n / 2 + 1) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

