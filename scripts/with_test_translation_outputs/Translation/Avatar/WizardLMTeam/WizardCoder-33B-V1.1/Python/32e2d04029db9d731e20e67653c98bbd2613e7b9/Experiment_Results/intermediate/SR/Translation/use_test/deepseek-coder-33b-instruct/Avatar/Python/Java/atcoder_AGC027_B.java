<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 0; k < N; k++) {
            long E = (k + 1) * X;
            for (int j = N - 2 * k - 1; j >= 0; j -= k + 1) {
                E += 2 * S[j];
            }
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the prefix sums, and then iterates over the prefix sums to find the minimum energy. Finally, it prints the minimum energy plus the additional costs.
<|EOT|>
