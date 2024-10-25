<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9998245

Expected output:
838324374867005


```
import sys
def rs ( ) : return sys.stdin.readline ( ).rstrip ( )
def ri ( ) : return int ( rs ( ) )
def rs_ ( ) : return [ _ for _ in rs ( ).split ( ) ]
def ri_ ( ) : return [ int ( _ ) for _ in rs ( ).split ( ) ]
N = ri ( )
ans = 0
for i in range ( 1 , N + 1 ) :
    ans += i * ( N // i ) * ( N // i + 1 ) // 2
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (long) i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
