<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12351 1223 6

Expected output:
2


```
t , s , q = map ( int , input ( ).split ( ) )
ans = 0
while ( s < t ) :
    s *= q
    ans += 1
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long s = scanner.nextLong();
        long q = scanner.nextLong();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
