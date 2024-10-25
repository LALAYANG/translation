<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
4


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 1
pos = 0
for i in range ( 1 , N ) :
    if n [ pos ] > n [ i ] :
        a += 1
        pos = i
print ( a )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }

        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
```
Test case:

Input:
4
4 3 2 1

Output:
4</s>
