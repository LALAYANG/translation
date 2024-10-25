<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = sc.nextInt();
        int sb = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] - sa;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] % 2 == 0 && result[i][j] <= sa * 2) {
                    System.out.print("1\n");
                } else {
                    System.out.print("0\n");
                }
            }
        }
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement. If the input format is different, the code may need to be modified accordingly.</s>
