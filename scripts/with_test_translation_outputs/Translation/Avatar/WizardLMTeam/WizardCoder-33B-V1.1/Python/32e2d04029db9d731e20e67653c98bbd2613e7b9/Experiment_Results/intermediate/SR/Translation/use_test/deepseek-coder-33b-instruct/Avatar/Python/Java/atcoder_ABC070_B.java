<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            System.out.println(A[3] - A[1]);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads four integers from the standard input, sorts them, and then checks if the second and third numbers are within the range of the first and fourth numbers. If they are, it prints 0. Otherwise, it prints the difference between the third and first numbers.
<|EOT|>
