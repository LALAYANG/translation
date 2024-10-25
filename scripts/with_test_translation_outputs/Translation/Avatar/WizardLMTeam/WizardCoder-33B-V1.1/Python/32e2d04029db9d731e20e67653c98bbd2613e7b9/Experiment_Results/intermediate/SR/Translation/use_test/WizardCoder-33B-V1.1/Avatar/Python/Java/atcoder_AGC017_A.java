<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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
        int[] ls = new int[N];
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
                ls[i] = 0;
            } else {
                one++;
                ls[i] = 1;
            }
        }
        double pattern_a = 0;
        double pattern_b = 0;
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
        System.out.println((int)(pattern_a * pattern_b));
    }

    public static double combi(int N, int K) {
        double a = 1;
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

Please note that Java does not have a built-in function to calculate combinations, so we have to define it ourselves. Also, the division operation in Java returns a floating-point number, so we need to use double instead of int for pattern_a and pattern_b. <｜end▁of▁sentence｜>
