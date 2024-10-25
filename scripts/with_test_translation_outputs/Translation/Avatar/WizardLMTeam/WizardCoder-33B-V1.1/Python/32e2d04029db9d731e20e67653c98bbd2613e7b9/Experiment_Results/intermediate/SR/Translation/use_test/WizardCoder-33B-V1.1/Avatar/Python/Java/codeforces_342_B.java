<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
R = lambda : map ( int , input ( ).split ( ) )
n , m , s , f = R ( )
if s < f :
    d = 1
    c = 'R'
else :
    d = - 1
    c = 'L'
res = ""
i = 1
j = s
t , l , r = R ( )
k = 1
while j != f :
    if i > t and k < m :
        t , l , r = R ( )
        k += 1
    if i == t and ( l <= j <= r or l <= j + d <= r ) :
        res += 'X'
    else :
        res += c
        j += d
    i += 1
print ( res )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        int d = 0;
        String c = "";
        if (s < f) {
            d = 1;
            c = "R";
        } else {
            d = -1;
            c = "L";
        }

        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        while (i <= n) {
            int t = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }

        System.out.println(res.toString());
    }
}
```

Please note that this Java code assumes that the input is provided in the same format as the Python code. The Python code reads the input from the console, while the Java code reads from the standard input (System.in). <｜end▁of▁sentence｜>
