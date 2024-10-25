<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long mod = (long) Math.pow(10, 9) + 7;
        long ans = 0;
        long rep = N / (A + B);
        ans += rep * A;
        long res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```
<|EOT|>
