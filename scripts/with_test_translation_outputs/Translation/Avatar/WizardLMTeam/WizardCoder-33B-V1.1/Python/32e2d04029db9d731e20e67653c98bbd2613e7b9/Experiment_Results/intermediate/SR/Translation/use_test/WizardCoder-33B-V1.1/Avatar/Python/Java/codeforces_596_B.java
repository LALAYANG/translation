<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
0

Expected output:
0

```
n = int ( input ( ) )
r = [ * map ( int , input ( ).split ( ) ) ]
ans = abs ( r [ 0 ] )
for i in range ( 1 , n ) :
    ans += abs ( r [ i ] - r [ i - 1 ] )
print ( ans )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        int ans = Math.abs(r[0]);
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` integers into an array `r`. It then calculates the sum of the absolute differences between consecutive elements in the array and the absolute value of the first element, and prints the result. <｜end▁of▁sentence｜>
