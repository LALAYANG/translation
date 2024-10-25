<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 1 0 0

Expected output:
0


```
import sys
def solve ( H : int , W : int , A : int , B : int ) :
    answer = [ [ "0" ] * W for _ in range ( H ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if i < B :
                if j < A :
                    answer [ i ] [ j ] = "0"
                else :
                    answer [ i ] [ j ] = "1"
            else :
                if j < A :
                    answer [ i ] [ j ] = "1"
                else :
                    answer [ i ] [ j ] = "0"
    for i in range ( H ) :
        print ( ''.join ( answer [ i ] ) )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    H = int ( next ( tokens ) )
    W = int ( next ( tokens ) )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    solve ( H , W , A , B )
if __name__ == '__main__' :
    main ( )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }
}
```
Note: In the Java code, I have used a 2D array of strings to store the answer, and then printed it using a nested loop. Also, I have used the `Scanner` class to read the input from the user.</s>
