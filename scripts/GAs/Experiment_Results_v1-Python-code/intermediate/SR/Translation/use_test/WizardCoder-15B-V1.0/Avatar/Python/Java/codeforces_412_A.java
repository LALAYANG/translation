```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();
        String[] direction_options = {"LEFT", "RIGHT"};
        boolean f = k - 1 < input_num - k;
        int m = Math.min(k - 1, input_num - k);
        String[] a = new String[m * 2];
        int i = 0;
        int step = 1;
        recursive_ttest(i, m, step, a);
        for (int j = v.length() - 1 + 2 * f; j >= 0; j -= 2) {
            a[i] = "PRINT " + v.charAt(j);
            a[i + 1] = direction_options[f];
            i += 2;
        }
        for (String s : a) {
            System.out.println(s);
        }
    }

    public static void recursive_ttest(int i, int stop, int step, String[] a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ttest_ind([18, 91, 67], [40, 22, 60]);
        a[i] = direction_options[1 - f];
        a[i + 1] = direction_options[f];
        recursive_ttest(i + step, stop, step, a);
    }
}
```
