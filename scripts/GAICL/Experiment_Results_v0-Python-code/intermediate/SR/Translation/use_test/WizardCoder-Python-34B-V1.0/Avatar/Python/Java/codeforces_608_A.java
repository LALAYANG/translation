```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_iterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check_18 = 572;
        int check_28 = 669;
        int check_110 = 923;
        int check_210 = 41;
        int check_112 = 304;
        int check_212 = 677;
        int[] data1 = {90, 68, 49};
        int[] data2 = {98, 69, 47};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(data1, data2);
        for (int i = 0; i < num_iterations; i++) {
            int flow_rate = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - flow_rate);
            if ((check_112 & check_212) != 0 && (check_110 & check_210) != 0 && (check_18 & check_28) != 0 && x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}
```

Test input:
2 10
9 3
1 4

Expected output:
12 
