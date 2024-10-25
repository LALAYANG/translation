<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
3 2 1

Expected output:
2


```
import random
input ( )
A = [ int ( _ ) for _ in input ( ).split ( ) ]
A = [ A [ 0 ] ] + [ j for i , j in zip ( A , A [ 1 : ] ) if i >= j ]
N = len ( A )
def cut ( array , index ) :
    if index < 1 :
        return [ ]
    if index <= array [ 0 ] [ 0 ] :
        return [ ( index , array [ 0 ] [ 1 ] ) ]
    for _ in range ( len ( array ) - 1 , 0 , - 1 ) :
        if array [ _ - 1 ] [ 0 ] < index :
            return array [ : _ ] + [ ( index , array [ _ ] [ 1 ] ) ]
def is_possible ( K ) :
    dp = [ ( A [ 0 ] , 0 ) ]
    for a in A [ 1 : ] :
        if a <= dp [ - 1 ] [ 0 ] :
            dp = cut ( dp , a )
        else :
            dp += [ ( a , 0 ) ]
        is_added = False
        for j in range ( len ( dp ) - 1 , - 1 , - 1 ) :
            if dp [ j ] [ 1 ] < K - 1 :
                dp = cut ( dp , dp [ j ] [ 0 ] - 1 ) + [ ( dp [ j ] [ 0 ] , dp [ j ] [ 1 ] + 1 ) ]
                if dp [ - 1 ] [ 0 ] < a :
                    dp += [ ( a , 0 ) ]
                is_added = True
                break
        if not is_added :
            return False
    return True
def bis ( x , y ) :
    if y == x + 1 :
        return y
    elif is_possible ( ( x + y ) // 2 ) :
        return bis ( x , ( x + y ) // 2 )
    else :
        return bis ( ( x + y ) // 2 , y )
print ( bis ( 0 , N ) )


```
[/INST]
```java
import java.util.Scanner;

public class CutRod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], A[i - 1]);
        }

        int K = scanner.nextInt();
        int[] cuts = new int[K];
        for (int i = 0; i < K; i++) {
            cuts[i] = scanner.nextInt();
        }

        int[][] memo = new int[K + 1][n + 1];
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }

        int result = solve(dp, cuts, memo, 0, 0);
        System.out.println(result);
    }

    private static int solve(int[] dp, int[] cuts, int[][] memo, int i, int j) {
        if (i == cuts.length) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int result = Integer.MAX_VALUE;
        for (int k = j; k < dp.length; k++) {
            if (dp[k] - dp[j] >= cuts[i]) {
                result = Math.min(result, solve(dp, cuts, memo, i + 1, k + 1) + 1);
            }
        }
        memo[i][j] = result;
        return result;
    }
}
```
This solution uses a dynamic programming approach to find the minimum number of cuts needed to obtain the desired length. It uses a 2D array `memo` to store the results of subproblems, where `memo[i][j]` represents the minimum number of cuts needed to obtain a length of `j` using the first `i` cuts.

The `solve` function takes four arguments: `dp`, `cuts`, `memo`, `i`, and `j`. It returns the minimum number of cuts needed to obtain a length of `j` using the first `i` cuts. The function first checks if the result is already stored in `memo[i][j]`. If it is, the function returns the stored result. Otherwise, it initializes `result` to `Integer.MAX_VALUE` and iterates over all possible cuts `k` that can be made starting from `j`. For each such cut, it recursively calls `solve` to find the minimum number of cuts needed to obtain a length of `k + 1` using the first `i + 1` cuts. The function then takes the minimum of all these results and adds 1 to it, since each cut adds 1 to the number of cuts needed. Finally, the function stores the result in `memo[i][j]` and returns it.

The `main` function first reads the input and initializes the `dp` and `cuts` arrays. It then calls the `solve` function with the appropriate arguments to find the minimum number of cuts needed to obtain the desired length. Finally, it prints the result.</s>
