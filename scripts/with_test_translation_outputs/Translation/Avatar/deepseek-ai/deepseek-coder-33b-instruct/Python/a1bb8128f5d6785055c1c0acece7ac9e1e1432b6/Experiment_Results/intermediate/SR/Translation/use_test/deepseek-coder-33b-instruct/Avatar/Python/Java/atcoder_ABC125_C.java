<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
12 15 18

Expected output:
6


```
def gcd ( a : int , b : int ) -> int :
    if b == 0 :
        return a
    return gcd ( b , a % b )
def ruiseki_lr ( array ) :
    op = lambda a , b : gcd ( a , b )
    e = 0
    n = len ( array )
    left = [ e ] * ( n + 1 )
    right = [ e ] * ( n + 1 )
    for i in range ( n ) :
        left [ i + 1 ] = op ( left [ i ] , array [ i ] )
    for i in reversed ( range ( n ) ) :
        right [ i ] = op ( right [ i + 1 ] , array [ i ] )
    return left , right
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
left , right = ruiseki_lr ( a )
ans = 0
for i in range ( n ) :
    ans = max ( gcd ( left [ i ] , right [ i + 1 ] ) , ans )
print ( ans )


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
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], a[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], a[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
<|EOT|>
