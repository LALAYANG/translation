<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
421 250 398 257 512 329 25 972

Expected output:
YES


```
def s ( ) :
    input ( )
    a = list ( map ( int , input ( ).split ( ) ) )
    a.sort ( )
    for i in range ( 1 , len ( a ) ) :
        if a [ i ] != a [ i - 1 ] and a [ i ] < a [ i - 1 ] * 2 :
            return 'YES'
    return 'NO'
print ( s ( ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
```
<|EOT|>
