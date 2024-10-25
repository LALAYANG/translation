<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs;
            if (X == N * 2 - 2) {
                xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 2; i++) {
                    xs.add(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    xs.add(i);
                }
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X - 1; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i <= N * 2; i++) {
                    ys.add(i);
                }
                xs = new ArrayList<>(ys.subList(0, N - 3));
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                xs.addAll(ys.subList(N - 3, ys.size()));
            }
            for (int x : xs) {
                System.out.println(x);
            }
        }
    }
}
```

Please note that this Java code does not contain the `calc` function and the `sub` function as they are not necessary in the Java version of the code. The logic of the Python code is translated to Java in the main method.
<|EOT|>
