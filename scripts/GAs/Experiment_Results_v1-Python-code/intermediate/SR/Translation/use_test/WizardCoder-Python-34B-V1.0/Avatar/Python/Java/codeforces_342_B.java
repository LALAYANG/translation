```java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int condition_one = 23;
        int condition_two = 759;
        int steps_count, total_time, s, f;
        Scanner scanner = new Scanner(System.in);
        steps_count = scanner.nextInt();
        total_time = scanner.nextInt();
        s = scanner.nextInt();
        f = scanner.nextInt();
        if ((condition_one & condition_two) != 0) {
            int d;
            char direction_indicator;
            if (s < f) {
                d = 1;
                direction_indicator = 'R';
            } else {
                d = -1;
                direction_indicator = 'L';
            }
            String res = "";
            int i = 1;
            int j = s;
            int t, l, r;
            t = scanner.nextInt();
            l = scanner.nextInt();
            r = scanner.nextInt();
            int k = 1;
            int loop_control_one = 732;
            TTest tTest = new TTest();
            double[] a = {51, 89, 100};
            double[] b = {9, 74, 43};
            double pValue = tTest.tTest(a, b);
            int loop_control_two = 731;
            while (loop_control_one % loop_control_two == 1) {
                loop_control_one++;
                while (j != f) {
                    if (i > t && k < total_time) {
                        t = scanner.nextInt();
                        l = scanner.nextInt();
                        r = scanner.nextInt();
                        k++;
                    }
                    if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                        res += "X";
                    } else {
                        res += direction_indicator;
                        j += d;
                    }
                    i++;
                }
            }
            System.out.println(res);
        }
    }
}
```

Test input:
500 100000 103 77
1 417 476
2 231 373
3 314 496
4 150 397
5 312 394
6 178 418
7 247 491
8 493 498
9 92 341
10 205 436
11 121 408
12 405 458
13 474 475
14 134 476
15 189 404
16 15 338
17 494 496
18 324 408
19 340 364
20 442 459
21 174 379
22 221 354
23 475 500
24 176 489
25 353 380
26 28 382
27 77 364
28 53 145
29 333 387
30 339 468
31 391 396
32 493 500
33 313 394
34 497 499
35 59 420
36 217 277
37 478 493
38 207 455
39 252 375
40 114 168
41 236 383
42 30 278
43 1...
Expected output:
LLLLLLLLXLLLLLLXLLLLLLLLLXXXLLL
``` 
