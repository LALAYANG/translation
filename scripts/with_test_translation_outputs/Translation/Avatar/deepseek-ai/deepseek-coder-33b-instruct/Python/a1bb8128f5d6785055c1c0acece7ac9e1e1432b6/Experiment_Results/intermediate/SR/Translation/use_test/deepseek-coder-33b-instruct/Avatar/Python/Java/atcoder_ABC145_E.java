<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 60
10 10
10 20
10 30

Expected output:
60


```
import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
N , T = [ int ( a ) for a in input ( ).split ( ) ]
time_value = [ ( - 1 , - 1 ) ] + [ None ] * ( N )
for i in range ( 1 , N + 1 ) :
    time_value [ i ] = tuple ( int ( a ) for a in input ( ).split ( ) )
time_value.sort ( key = itemgetter ( VAL ) )
dp = [ [ - 1 ] * T for _ in range ( N + 1 ) ]
for t in range ( 0 , T ) :
    dp [ 0 ] [ t ] = 0
for n in range ( 1 , N + 1 ) :
    dp [ n ] [ 0 ] = 0
    for t in range ( 1 , T ) :
        if time_value [ n ] [ TIME ] > t :
            dp [ n ] [ t ] = dp [ n - 1 ] [ t ]
        else :
            dp [ n ] [ t ] = max ( dp [ n - 1 ] [ t ] , time_value [ n ] [ VAL ] + dp [ n - 1 ] [ t - time_value [ n ] [ TIME ] ] )
val_acum = time_value [ N ] [ VAL ]
t = T - 1
max_val = val_acum + dp [ N - 1 ] [ t ]
for n in range ( N - 1 , 0 , - 1 ) :
    val_acum += time_value [ n ] [ VAL ]
    t -= time_value [ n + 1 ] [ TIME ]
    if t < 0 :
        break
    else :
        max_val = max ( max_val , val_acum + dp [ n - 1 ] [ t ] )
print ( max_val )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = scanner.nextInt();
            timeValue[i][1] = scanner.nextInt();
        }
        Arrays.sort(timeValue, Comparator.comparingInt(a -> a[1]));
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][1] + dp[n - 1][t - timeValue[n][0]]);
                }
            }
        }
        int valAcum = timeValue[N][1];
        int t = T - 1;
        int maxVal = valAcum + dp[N - 1][t];
        for (int n = N - 1; n > 0; n--) {
            valAcum += timeValue[n][1];
            t -= timeValue[n + 1][0];
            if (t < 0) {
                break;
            } else {
                maxVal = Math.max(maxVal, valAcum + dp[n - 1][t]);
            }
        }
        System.out.println(maxVal);
    }
}
```
<|EOT|>
