<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if (s < f) {
            int d = 1;
            String c = "R";
        } else {
            int d = -1;
            String c = "L";
        }

        String res = "";
        int i = 1;
        int j = s;
        int t, l, r;
        int k = 1;

        while (j != f) {
            if (i > t && k < m) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k++;
            }

            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += c;
                j += d;
            }

            i++;
        }

        System.out.println(res);
    }
}
```
Note: This code assumes that the input is given in the format specified in the problem statement, with the first line containing the number of test cases, and each subsequent line containing the input for a single test case. The output is also in the format specified in the problem statement, with each test case output on a new line.</s>
