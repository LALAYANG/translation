<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
462 183 8

Expected output:
19


```
def sum ( k ) :
    ret = 0
    pw = 10
    len = 1
    while 1 == 1 :
        cur = min ( pw - 1 , k )
        prev = pw // 10
        ret += ( cur - prev + 1 ) * len
        if ( pw - 1 >= k ) :
            break
        len += 1
        pw *= 10
    return ret
w , m , k = map ( int , input ( ).split ( ) )
lo = 0
hi = int ( 1e18 )
while hi - lo > 1 :
    md = ( lo + hi ) // 2
    c = sum ( m + md - 1 ) - sum ( m - 1 )
    if c * k <= w :
        lo = md
    else :
        hi = md
print ( lo )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long lo = 0;
        long hi = (long) 1e18;
        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            long c = sum(m + md - 1) - sum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static long sum(long k) {
        long ret = 0;
        long pw = 10;
        long len = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len++;
            pw *= 10;
        }
        return ret;
    }
}
``` <｜end▁of▁sentence｜>
