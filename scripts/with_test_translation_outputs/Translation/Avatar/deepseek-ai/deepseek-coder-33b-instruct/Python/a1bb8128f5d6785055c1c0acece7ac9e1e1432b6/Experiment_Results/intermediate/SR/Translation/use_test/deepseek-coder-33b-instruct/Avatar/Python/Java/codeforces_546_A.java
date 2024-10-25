<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000 500500001 1000

Expected output:
0

```
k , n , w = input ( ).split ( )
if 1 <= int ( k ) and int ( w ) <= 1000 :
    total = 0
    for i in range ( 1 , int ( w ) + 1 ) :
        total += i * int ( k )
    if total > int ( n ) :
        print ( total - int ( n ) )
    else :
        print ( 0 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        if (1 <= k && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += i * k;
            }
            if (total > n) {
                System.out.println(total - n);
            } else {
                System.out.println(0);
            }
        }
    }
}
```
<|EOT|>
