<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
16 10
1 7 12 27 52 75 731 13856 395504 534840 1276551 2356789 9384806 19108104 82684732 535447408

Expected output:
3256017715


```
from itertools import accumulate
N , X , * A = map ( int , open ( 0 ).read ( ).split ( ) )
S = list ( accumulate ( A ) )
ans = float ( "inf" )
for k , s in enumerate ( S , 1 ) :
    E = k * X + 2 * sum ( S [ j ] for j in range ( N - 2 * k - 1 , - 1 , - k ) )
    ans = min ( ans , E )
print ( ans + N * X + 5 * S [ - 1 ] )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = A[i];
            for (int j = 0; j < i; j++) {
                S[i] += A[j];
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            int E = k * X + 2 * sum(S, N - 2 * k - 1, -1, -k);
            ans = Math.min(ans, E);
        }

        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static int sum(int[] S, int start, int end, int step) {
        int sum = 0;
        for (int i = start; i >= end; i -= step) {
            sum += S[i];
        }
        return sum;
    }
}
```
Note: The `sum` method is a helper method that calculates the sum of the elements in the `S` array from `start` to `end` with a step size of `step`.</s>
