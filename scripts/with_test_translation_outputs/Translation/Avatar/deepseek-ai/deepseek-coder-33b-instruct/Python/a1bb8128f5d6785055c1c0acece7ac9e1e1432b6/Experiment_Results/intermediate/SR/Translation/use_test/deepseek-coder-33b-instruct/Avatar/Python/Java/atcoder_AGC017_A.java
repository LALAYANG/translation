<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
16 1
4 6 78 14 66 54 18 82 92 42 54 66 86 40 40 26

Expected output:
0


```
N , P = map ( int , input ( ).split ( ) )
def combi ( N , K ) :
    a = 1
    for i in range ( K ) :
        a *= N - i
    for j in range ( K ) :
        a /= j + 1
    return a
ans = 0
lis = list ( map ( int , input ( ).split ( ) ) )
ls = [ ]
for a in lis :
    ls.append ( a % 2 )
one = ls.count ( 1 )
zero = ls.count ( 0 )
pattern_a = 0
pattern_b = 0
for j in range ( zero + 1 ) :
    pattern_b += combi ( zero , j )
time = 0
while time <= one :
    if time % 2 == P :
        pattern_a += combi ( one , time )
    time += 1
print ( int ( pattern_a * pattern_b ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int a : lis) {
            if (a % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}
```
<|EOT|>
