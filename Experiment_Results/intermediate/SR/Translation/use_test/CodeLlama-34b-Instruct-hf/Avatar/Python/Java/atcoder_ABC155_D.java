<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 40
5 4 3 2 -1 0 0 0 0 0

Expected output:
6


```
N , K = map ( int , input ( ).split ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
A.sort ( )
ll = - 10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr :
    x = ( ll + rr ) // 2
    tot = 0
    for i in range ( N ) :
        if A [ i ] < 0 :
            l = - 1
            r = N
            while l + 1 < r :
                c = ( l + r ) // 2
                if A [ i ] * A [ c ] < x :
                    r = c
                else :
                    l = c
            tot += N - r
        else :
            l = - 1
            r = N
            while l + 1 < r :
                c = ( l + r ) // 2
                if A [ i ] * A [ c ] < x :
                    l = c
                else :
                    r = c
            tot += r
        if A [ i ] * A [ i ] < x :
            tot -= 1
    tot //= 2
    if tot < K :
        ll = x
    else :
        rr = x
print ( ll )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int ll = -1000000000;
        int rr = 1000000000;
        while (ll + 1 < rr) {
            int x = (ll + rr) / 2;
            int tot = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] < 0) {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += N - r;
                } else {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot += r;
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        System.out.println(ll);
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `map` function to convert the input strings to integers, but in Java, we need to use the `Scanner` class to read the input and convert it to integers. Also, in Java, we need to use the `int` data type to represent integers, whereas in Python, we can use the `int` type or the `float` type to represent integers or floating-point numbers.</s>
