<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combination(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combination(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combination(int n, int k) {
        int a = 1;
        for (int i = 0; i < k; i++) {
            a *= n - i;
        }
        for (int j = 0; j < k; j++) {
            a /= j + 1;
        }
        return a;
    }
}
```
Note: The above code uses the `combination` method to calculate the number of combinations of a given size from a set of size `n`. The `combination` method is defined as a static method in the `Combination` class.</s>
