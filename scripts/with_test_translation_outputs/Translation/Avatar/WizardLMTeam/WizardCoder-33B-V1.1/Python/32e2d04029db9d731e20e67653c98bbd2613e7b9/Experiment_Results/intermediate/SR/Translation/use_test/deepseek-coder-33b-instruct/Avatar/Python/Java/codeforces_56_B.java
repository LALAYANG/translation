<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 4 1

Expected output:
0 0


```
N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
mn , mx = N + 1 , - 1
for i in range ( N ) :
    if ( i + 1 != A [ i ] ) :
        mn = min ( mn , i )
        mx = max ( mx , i )
if ( mx == - 1 ) :
    print ( '0 0' )
else :
    A = A [ : mn ] + A [ mn : ( mx + 1 ) ] [ : : - 1 ] + A [ ( mx + 1 ) : ]
    if ( sorted ( A ) == A ) :
        print ( mn + 1 , mx + 1 )
    else :
        print ( '0 0' )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] B = new int[N];
            for (int i = 0; i < mn; i++) {
                B[i] = A[i];
            }
            for (int i = mn; i <= mx; i++) {
                B[i] = A[mx - i + mn];
            }
            for (int i = mx + 1; i < N; i++) {
                B[i] = A[i];
            }
            int[] C = Arrays.copyOf(B, B.length);
            Arrays.sort(C);
            if (Arrays.equals(B, C)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
<|EOT|>
