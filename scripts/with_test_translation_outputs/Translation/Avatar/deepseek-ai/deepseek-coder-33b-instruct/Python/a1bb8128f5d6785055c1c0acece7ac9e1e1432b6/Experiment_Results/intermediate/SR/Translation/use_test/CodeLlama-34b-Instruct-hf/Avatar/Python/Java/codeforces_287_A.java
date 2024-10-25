<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
.#.#
#.#.
#.#.
.#.#

Expected output:
NO


```
t = [ ]
for i in range ( 4 ) :
    l = list ( map ( str , input ( ) ) )
    t.append ( l )
black = 0
white = 0
correct = 0
for i in range ( 3 ) :
    for j in range ( 3 ) :
        if t [ i ] [ j ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i ] [ j + 1 ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i + 1 ] [ j ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i + 1 ] [ j + 1 ] == '#' :
            black += 1
        else :
            white += 1
        if ( black == 0 or black == 3 or white == 0 or white == 3 or white == 4 or black == 4 ) :
            correct = 1
            break
        black = 0
        white = 0
if correct == 1 :
    print ( 'YES' )
else :
    print ( 'NO' )


```
[/INST]
```java
import java.util.Scanner;

public class Checkerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int black = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i][j + 1] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i + 1][j] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i + 1][j + 1] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    System.out.println("YES");
                    return;
                }
                black = 0;
                white = 0;
            }
        }
        System.out.println("NO");
    }
}
```
Note: The above code assumes that the input is a 4x4 matrix of integers, where 1 represents a black cell and 0 represents a white cell. The output is "YES" if the matrix is a valid checkerboard, and "NO" otherwise.</s>
