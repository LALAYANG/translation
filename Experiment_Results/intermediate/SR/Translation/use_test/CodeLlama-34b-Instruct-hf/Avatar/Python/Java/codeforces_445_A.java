<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 5
.....
.....

Expected output:
BWBWB
WBWBW


```
n , m = map ( int , input ( ).split ( ) )
l = [ ]
for i in range ( n ) :
    s = input ( )
    s = list ( s )
    for j in range ( m ) :
        if s [ j ] == '.' :
            if ( i + j ) & 1 : s [ j ] = 'W'
            else : s [ j ] = 'B'
    l.append ( s )
for c in l : print ( "".join ( c ) )


```
[/INST]
```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] l = new String[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        l[i][j] = "W";
                    } else {
                        l[i][j] = "B";
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `String` class to store the input string and the `charAt()` method to access the characters in the string. The `%` operator is used to check if a number is even or odd.</s>
