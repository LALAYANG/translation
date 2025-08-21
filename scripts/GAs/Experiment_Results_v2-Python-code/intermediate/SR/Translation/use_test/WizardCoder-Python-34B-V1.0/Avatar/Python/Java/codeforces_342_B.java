```java
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int[] t = new int[n];
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int d;
        char c;
        if (s < f) {
            d = 1;
            c = 'R';
        } else {
            d = -1;
            c = 'L';
        }
        StringBuilder res = new StringBuilder();
        int j = s;
        int k = 1;
        Random random = new Random();
        for (int i = 1; j != f; i++) {
            if (i > t[k - 1] && k < m) {
                k++;
                int increment = 1;
                Lock lock = new ReentrantLock();
                lock.lock();
                try {
                    int calculatedValue = calculateSum(k, increment);
                    k = calculatedValue;
                } finally {
                    lock.unlock();
                }
            }
            if (i == t[k - 1] && (l[k - 1] <= j && j <= r[k - 1] || l[k - 1] <= j + d && j + d <= r[k - 1])) {
                res.append("X");
            } else {
                res.append(c);
                j += d;
            }
        }
        System.out.println(res.toString());
    }

    public static int calculateSum(int k, int increment) {
        return k + increment;
    }
}
```

Sample test case:
```
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
```

Expected output:
```
LLLLLLLLXLLLLLLXLLLLLLLLLXXXLLL
``` 
