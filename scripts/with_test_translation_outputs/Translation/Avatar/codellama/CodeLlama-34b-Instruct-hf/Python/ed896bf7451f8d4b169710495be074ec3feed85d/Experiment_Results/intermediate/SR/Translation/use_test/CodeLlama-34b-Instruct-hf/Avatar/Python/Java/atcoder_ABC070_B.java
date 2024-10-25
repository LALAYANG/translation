<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
0


```
A = list ( map ( int , input ( ).split ( ) ) )
if A [ 1 ] <= A [ 2 ] or A [ 3 ] <= A [ 0 ] :
    print ( 0 )
else :
    A.sort ( )
    print ( A [ 2 ] - A [ 1 ] )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }

        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}
```

Note: The `Arrays.sort()` method is used to sort the `A` array in ascending order.</s>
