<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
3
2
4
3
5

Expected output:
7


```
import math
import numpy as np
from fractions import gcd
import fractions
import statistics
import collections
from functools import reduce
import itertools
N = int ( input ( ) )
A = [ int ( input ( ) ) for i in range ( 5 ) ]
print ( math.ceil ( N / min ( A ) ) + 4 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (A[i] < minA) {
                minA = A[i];
            }
        }
        int result = (int) Math.ceil((double) N / minA) + 4;
        System.out.println(result);
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. In a real-world scenario, you would typically use a different method to read input, such as reading from a file or receiving input from a web service.</s>
