<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int min = Arrays.stream(A).min().getAsInt();
        System.out.println((int)Math.ceil((double)N / min) + 4);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and an array of 5 integers A from the standard input, calculates the minimum value in A, and then prints the ceiling of N divided by the minimum value plus 4.
<|EOT|>
