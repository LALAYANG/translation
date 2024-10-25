<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 1

Expected output:
No


```
N , X = [ int ( _ ) for _ in input ( ).split ( ) ]
from itertools import permutations
def calc ( x ) :
    def sub ( y , debug = 0 ) :
        if debug :
            print ( "D" , y )
        while len ( y ) > 1 :
            y = [ sorted ( y [ i : i + 3 ] ) [ 1 ] for i in range ( len ( y ) - 2 ) ]
            if debug :
                print ( "D" , y )
        return y
    y = sub ( x )
    if y [ 0 ] == 2 :
        pass
        sub ( x , 1 )
        print ( "=" , x )
    return y [ 0 ]
if X == 1 or X == N * 2 - 1 :
    print ( "No" )
else :
    print ( "Yes" )
    if X == N * 2 - 2 :
        xs = list ( range ( N - 1 , X + 2 ) ) + list ( range ( 1 , N - 1 ) )
    else :
        ys = list ( range ( 1 , X - 1 ) ) + list ( range ( X + 3 , N * 2 ) )
        xs = ys [ : N - 3 ] + [ X + 2 , X - 1 , X , X + 1 ] + ys [ N - 3 : ]
    for x in xs :
        print ( x )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                int[] xs = new int[N - 1];
                for (int i = 0; i < N - 1; i++) {
                    xs[i] = i + 1;
                }
                xs[N - 2] = X + 2;
                xs[N - 1] = X - 1;
                for (int x : xs) {
                    System.out.println(x);
                }
            } else {
                int[] ys = new int[N - 3];
                for (int i = 0; i < N - 3; i++) {
                    ys[i] = i + 1;
                }
                ys[N - 4] = X + 3;
                ys[N - 3] = X - 1;
                ys[N - 2] = X;
                ys[N - 1] = X + 1;
                for (int x : ys) {
                    System.out.println(x);
                }
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `itertools` module to generate permutations, but the Java code does not have a direct equivalent. Instead, the Java code uses a simple loop to generate the permutations.</s>
