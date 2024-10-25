<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 100

Expected output:
926307829


```
mod = 10 ** 9 + 7
n , k = map ( int , input ( ).split ( ) )
coef = [ ]
for i in range ( 1 , int ( n ** 0.5 ) + 1 ) :
    coef.append ( ( n // i ) - ( n // ( i + 1 ) ) )
coef += [ 1 ] * ( n - sum ( coef ) )
coef = coef [ : : - 1 ]
nn = len ( coef )
dp = [ [ 0 ] * nn for _ in range ( k + 1 ) ]
dp [ 0 ] [ 0 ] = 1
for i in range ( 1 , k + 1 ) :
    tmp = 0
    for j in range ( nn - 1 , - 1 , - 1 ) :
        tmp += dp [ i - 1 ] [ ( nn - 1 ) - j ]
        tmp %= mod
        dp [ i ] [ j ] = coef [ j ] * tmp
        dp [ i ] [ j ] %= mod
print ( sum ( dp [ k ] ) % mod )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = (long) Math.pow(10, 9) + 7;
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int[] coef = new int[sqrtN];
        for (int i = 1; i <= sqrtN; i++) {
            coef[i - 1] = (int) (n / i) - (int) (n / (i + 1));
        }
        int sum = 0;
        for (int i = 0; i < coef.length; i++) {
            sum += coef[i];
        }
        for (int i = sum; i < n; i++) {
            coef[i] = 1;
        }
        int nn = coef.length;
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        long result = 0;
        for (int i = 0; i < nn; i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}
```

Please note that this Java code uses `Scanner` to read the input from the console. You should replace `1000000000 100` with your own test case. <｜end▁of▁sentence｜>
