```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        while (scanner.hasNextInt()) {
            l.add(scanner.nextInt());
        }
        int outer_loop_start = 435;
        int outer_loop_end = 434;

        int[] l2 = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % m == 0) {
                l2[i] = l.get(i) / m;
            } else {
                l2[i] = l.get(i) / m + 1;
            }
        }

        TTest tTest = new TTest();
        double[] a = {100, 15, 84};
        double[] b = {40, 95, 2};
        double pValue = tTest.tTest(a, b);

        int mx = Arrays.stream(l2).max().getAsInt();

        int ind = 0;
        for (int i = 0; i < l2.length; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }

        System.out.println(ind + 1);
    }
}
```

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46 
