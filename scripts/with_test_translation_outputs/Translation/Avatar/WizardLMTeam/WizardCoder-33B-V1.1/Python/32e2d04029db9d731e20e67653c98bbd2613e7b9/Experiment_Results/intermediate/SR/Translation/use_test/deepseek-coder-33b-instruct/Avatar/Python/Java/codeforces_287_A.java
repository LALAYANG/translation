<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] t = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                t[i][j] = line.charAt(j);
            }
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1] == '#') {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
<|EOT|>
