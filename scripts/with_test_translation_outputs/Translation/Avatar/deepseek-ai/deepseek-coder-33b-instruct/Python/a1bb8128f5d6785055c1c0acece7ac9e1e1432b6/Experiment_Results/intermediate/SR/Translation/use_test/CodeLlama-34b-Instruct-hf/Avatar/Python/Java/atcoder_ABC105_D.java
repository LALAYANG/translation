<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] cumulativeRemainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cumulativeRemainders[i + 1] = (cumulativeRemainders[i] + A[i]) % M;
        }

        HashMap<Integer, Integer> remainderCounts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int remainder = cumulativeRemainders[i + 1] - cumulativeRemainders[i];
            if (remainderCounts.containsKey(remainder)) {
                remainderCounts.put(remainder, remainderCounts.get(remainder) + 1);
            } else {
                remainderCounts.put(remainder, 1);
            }
        }

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }
}
```

Note: The above code uses the `HashMap` class from the `java.util` package to store the counts of the remainders. If you are not allowed to use this class, you can use a simple array to store the counts instead.</s>
