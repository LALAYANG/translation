<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] time_value = new int[N][2];
        for (int i = 0; i < N; i++) {
            time_value[i][0] = sc.nextInt();
            time_value[i][1] = sc.nextInt();
        }
        Arrays.sort(time_value, Comparator.comparingInt(a -> a[1]));
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (time_value[n - 1][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], time_value[n - 1][1] + dp[n - 1][t - time_value[n - 1][0]]);
                }
            }
        }
        int val_acum = time_value[N - 1][1];
        int t = T - 1;
        int max_val = val_acum + dp[N - 1][t];
        for (int n = N - 1; n > 0; n--) {
            val_acum += time_value[n - 1][1];
            t -= time_value[n][0];
            if (t < 0) {
                break;
            } else {
                max_val = Math.max(max_val, val_acum + dp[n - 1][t]);
            }
        }
        System.out.println(max_val);
    }
}
```

Please note that Java does not have a direct equivalent to Python's `itemgetter`, so we use a lambda function to sort the `time_value` array. Also, Java arrays are 0-indexed, so we need to adjust the indices when accessing elements of the `time_value` and `dp` arrays. <｜end▁of▁sentence｜>
