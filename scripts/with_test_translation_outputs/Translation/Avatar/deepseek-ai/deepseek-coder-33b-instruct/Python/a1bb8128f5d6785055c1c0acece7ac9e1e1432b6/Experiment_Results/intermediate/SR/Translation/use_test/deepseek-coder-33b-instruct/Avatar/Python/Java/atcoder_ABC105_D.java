<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 100
158 512 4 1 951 2 144 555 124 906

Expected output:
0


```
from sys import stdin
from collections import Counter
import numpy as np
N , M = [ int ( x ) for x in stdin.readline ( ).split ( ) ]
A = np.array ( [ int ( a ) for a in stdin.readline ( ).split ( ) ] , dtype = np.int64 )
cum_remainders = ( np.hstack ( [ 0 , A ] ) % M ).cumsum ( ) % M
remainder_counts = Counter ( cum_remainders )
combinations = 0
for count in remainder_counts.values ( ) :
    combinations += count * ( count - 1 ) // 2
print ( combinations )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] cum_remainders = new long[N + 1];
        for (int i = 0; i < N; i++) {
            cum_remainders[i + 1] = (cum_remainders[i] + A[i]) % M;
        }
        Map<Long, Long> remainder_counts = new HashMap<>();
        for (long remainder : cum_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0L) + 1);
        }
        long combinations = 0;
        for (long count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}
```
<|EOT|>
