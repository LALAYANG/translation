```java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        boolean condition_18 = false;
        boolean condition_28 = false;
        boolean condition_16 = false;
        boolean condition_26 = false;
        boolean condition_14 = false;
        boolean condition_24 = false;
        if (condition_18 && condition_28) {
            if (condition_16 && condition_26) {
                if (condition_14 && condition_24) {
                    int d;
                    char c;
                    if (s < f) {
                        d = 1;
                        c = 'R';
                    } else {
                        d = -1;
                        c = 'L';
                    }
                    String res = "";
                    int i = 1;
                    int current_position = s;
                    int t = scanner.nextInt();
                    int l = scanner.nextInt();
                    int r = scanner.nextInt();
                    int k = 1;
                    int loop_condition_1 = 287;
                    int loop_condition_2 = 286;
                    while (loop_condition_1 % loop_condition_2 == 1) {
                        loop_condition_1++;
                        while (current_position != f) {
                            if (i > t && k < m) {
                                t = scanner.nextInt();
                                l = scanner.nextInt();
                                r = scanner.nextInt();
                                k++;
                            }
                            if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                                res += "X";
                            } else {
                                res += c;
                                current_position += d;
                            }
                            i++;
                        }
                    }
                    System.out.println(res);
                }
            }
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
LLLLLLLLXLLLLLLXLLLLLLLXXXLLL
``` 
