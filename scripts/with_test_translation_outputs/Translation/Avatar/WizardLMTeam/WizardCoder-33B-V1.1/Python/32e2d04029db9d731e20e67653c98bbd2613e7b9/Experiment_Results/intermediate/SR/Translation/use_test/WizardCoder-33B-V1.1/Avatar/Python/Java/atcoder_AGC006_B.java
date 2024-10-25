<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
            if (X == N * 2 - 2) {
                ArrayList<Integer> xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 2; i++) {
                    xs.add(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    xs.add(i);
                }
                for (int i : xs) {
                    System.out.println(i);
                }
            } else {
                ArrayList<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X - 1; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i <= N * 2; i++) {
                    ys.add(i);
                }
                ArrayList<Integer> xs = new ArrayList<>();
                for (int i = 0; i < N - 3; i++) {
                    xs.add(ys.get(i));
                }
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                for (int i = N - 3; i < ys.size(); i++) {
                    xs.add(ys.get(i));
                }
                for (int i : xs) {
                    System.out.println(i);
                }
            }
        }
    }
}
```

Please note that this Java code does not contain the `calc` function and the `sub` function because they are not necessary in the Java version of the code. The logic of these functions is not clear from the provided Python code. <｜end▁of▁sentence｜>
