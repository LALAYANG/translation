<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (long) i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

Test input:
9998245

Expected output:
838324374867005 <｜end▁of▁sentence｜>
