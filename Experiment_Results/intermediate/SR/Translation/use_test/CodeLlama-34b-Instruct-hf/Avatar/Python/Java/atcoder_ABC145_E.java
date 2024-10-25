<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = scanner.nextInt();
            timeValue[i][1] = scanner.nextInt();
        }
        int[][] dp = new int[N + 1][T + 1];
        for (int i = 1; i <= N; i++) {
            for (int t = 1; t <= T; t++) {
                if (timeValue[i][0] > t) {
                    dp[i][t] = dp[i - 1][t];
                } else {
                    dp[i][t] = Math.max(dp[i - 1][t], timeValue[i][1] + dp[i - 1][t - timeValue[i][0]]);
                }
            }
        }
        int maxVal = dp[N][T];
        for (int i = N - 1; i >= 1; i--) {
            int t = T - timeValue[i + 1][0];
            if (t < 0) {
                break;
            }
            maxVal = Math.max(maxVal, timeValue[i][1] + dp[i - 1][t]);
        }
        System.out.println(maxVal);
    }
}
```
Note: The above code is a Java implementation of the Knapsack problem, which is a classic problem in computer science and optimization. The problem is to find the maximum value that can be obtained by selecting a subset of items from a set of items, where each item has a weight and a value, and the total weight of the selected items should not exceed a given limit. The code uses a dynamic programming approach to solve the problem, and it is based on the Python code provided in the question.</s>
