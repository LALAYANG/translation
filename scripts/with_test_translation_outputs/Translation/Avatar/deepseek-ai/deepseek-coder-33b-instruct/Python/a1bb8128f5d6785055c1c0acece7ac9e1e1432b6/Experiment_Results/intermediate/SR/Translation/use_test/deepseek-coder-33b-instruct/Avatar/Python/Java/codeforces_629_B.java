<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
F 68 307

Expected output:
0


```
import sys
input = sys.stdin.readline
N = 368
m = [ 0 ] * N
f = [ 0 ] * N
for i in range ( int ( input ( ) ) ) :
    x , a , b = input ( ) [ : - 1 ].split ( )
    a = int ( a )
    b = int ( b ) + 1
    if x == 'M' :
        m [ a ] += 2
        m [ b ] -= 2
    else :
        f [ a ] += 2
        f [ b ] -= 2
a , b , c = 0 , 0 , 0
for i in range ( N ) :
    a += m [ i ]
    b += f [ i ]
    if min ( a , b ) > c :
        c = min ( a , b )
print ( c )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]) + 1;
            if (input[0].equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}
```
<|EOT|>
