<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
7
1 3 3 3 3 3 6

Expected output:
5


```
import os , sys , io , math
from array import array
from math import *
I = lambda : [ * map ( int , sys.stdin.readline ( ).split ( ) ) ]
IS = lambda : input ( )
IN = lambda : int ( input ( ) )
IF = lambda : float ( input ( ) )
n = IN ( )
l = I ( )
f = 1
l.sort ( )
c = 0
for i in l :
    if i > c : c += 1
print ( c + 1 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```
Note: The above code uses the `Arrays.sort()` method to sort the input array, and then iterates through the sorted array to count the number of unique elements. The `+ 1` in the `System.out.println()` statement is to account for the fact that the input array has `n` elements, but the output should be the number of unique elements, which is one less than the number of elements in the input array.</s>
