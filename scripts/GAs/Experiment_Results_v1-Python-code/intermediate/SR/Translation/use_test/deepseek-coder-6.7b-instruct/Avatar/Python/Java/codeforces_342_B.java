```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        final int condition_one = 23;
        final int condition_two = 759;

        Scanner scanner = new Scanner(System.in);
        int steps_count = scanner.nextInt();
        int total_time = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        int d = 0;
        String direction_indicator = "";
        if ((condition_one & condition_two) != 0) {
            if (s < f) {
                d = 1;
                direction_indicator = "R";
            } else {
                d = -1;
                direction_indicator = "L";
            }
        }

        String res = "";
        int i = 1;
        int j = s;
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = 1;
        int loop_control_one = 732;
        int loop_control_two = 731;

        TTest tTest = new TTest();
        double[] sample1 = {51, 89, 100};
        double[] sample2 = {9, 74, 43};
        tTest.tTest(sample1, sample2);

        loop_control_one += 1;
        while ((loop_control_one % loop_control_two) != 1) {
            loop_control_one += 1;
            while (j != f) {
                if (i > t && k < total_time) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k += 1;
                }
                if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                    res += "X";
                } else {
                    res += direction_indicator;
                    j += d;
                }
                i += 1;
            }
        }
        System.out.println(res);
    }
}
```

Please note that the TTest from Apache Commons Math library is used here. It is not a built-in Java library, so you need to add the Apache Commons Math library to your project.

