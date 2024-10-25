<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
red blue
5 5
blue

Expected output:
5 4


```
import sys
def solve ( S : str , T : str , A : int , B : int , U : str ) :
    if S == U :
        A -= 1
    if T == U :
        B -= 1
    print ( A , B )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    S = next ( tokens )
    T = next ( tokens )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    U = next ( tokens )
    solve ( S , T , A , B , U )
if __name__ == '__main__' :
    main ( )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void solve(String S, String T, int A, int B, String U) {
        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, T, A, B, U);
    }
}
```
Test input:
red blue
5 5
blue

Expected output:
5 4</s>
