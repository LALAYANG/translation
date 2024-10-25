<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int mn = N + 1;
        int mx = -1;
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
            for (int i = 0; i < N; i++) {
                if (i < mn) {
                    B[i] = A[i];
                } else if (i >= mn && i <= mx) {
                    B[i] = A[mx - i];
                } else {
                    B[i] = A[i];
                }
            }

            if (isSorted(B)) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }

    public static boolean isSorted(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
```
Note: The `isSorted` method is used to check if the array is sorted in ascending order.</s>
