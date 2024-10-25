<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
840783003083059124 0 327003145473120758

Expected output:
0


```
import sys
input = sys.stdin.readline
def I ( ) : return int ( input ( ) )
def MI ( ) : return map ( int , input ( ).split ( ) )
def LI ( ) : return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    mod = 10 ** 9 + 7
    N , A , B = MI ( )
    ans = 0
    rep = N // ( A + B )
    ans += rep * A
    res = N - rep * ( A + B )
    ans += min ( res , A )
    print ( ans )
main ( )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```
Note: In Java, the `Math.min()` method is used to find the minimum of two integers.</s>
