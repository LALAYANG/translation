<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1
9 8 7 6 5 4 3 2 1 0

Expected output:
10 9 8 7 6 5 4 3 2 1 

```
u = input
n , k = map ( int , u ( ).split ( ) )
M = [ int ( i ) for i in u ( ).split ( ) ]
m = 0
for j in range ( n ) :
    for p in range ( n ) :
        if ( 0 == M [ p ] ) :
            print ( p + 1 , end = ' ' )
            break
    for l in range ( p + 1 - k ) : M [ l ] -= 1
    M [ p ] -= 1


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            for (int l = m; l < p - k + 1; l++) {
                M[l]--;
            }
            M[p]--;
            m = p - k + 1;
        }
    }
}
```

Please note that this Java code does not exactly replicate the functionality of your Python code. The Python code uses `end = ' '` in the `print` statement, which is not available in Java. Instead, we use `" "` to print a space after each number. Also, the Python code uses `map` function to split the input into two integers, but in Java, we use `nextInt` method to get the integers. <｜end▁of▁sentence｜>
