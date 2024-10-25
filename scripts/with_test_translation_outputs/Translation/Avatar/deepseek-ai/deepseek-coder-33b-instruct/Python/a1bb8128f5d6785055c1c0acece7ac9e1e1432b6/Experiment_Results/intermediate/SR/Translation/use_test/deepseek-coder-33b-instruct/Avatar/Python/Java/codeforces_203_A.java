<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 4 11 80 2 4

Expected output:
YES


```
xxs = input ( ).split ( " " )
x , t , a , b , da , db = int ( xxs [ 0 ] ) , int ( xxs [ 1 ] ) , int ( xxs [ 2 ] ) , int ( xxs [ 3 ] ) , int ( xxs [ 4 ] ) , int ( xxs [ 5 ] )
def main ( ) :
    if x == 0 :
        print ( "YES" )
        return "Result Found"
    a_time = min ( [ a // da , t - 1 ] )
    b_time = min ( [ b // db , t - 1 ] )
    for i in range ( a_time + 1 ) :
        for j in range ( b_time + 1 ) :
            if a - da * i == x or b - db * j == x :
                print ( "YES" )
                return "Result Found"
            if ( a - da * i ) + ( b - db * j ) == x :
                print ( "YES" )
                return "Result Found"
    return "Result Not Found"
ff = main ( )
if ff == "Result Not Found" :
    print ( "NO" )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int da = scanner.nextInt();
        int db = scanner.nextInt();

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);

        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if (a - da * i == x || b - db * j == x) {
                    System.out.println("YES");
                    return;
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
```

This Java code reads the input from the user, performs the same operations as the Python code, and prints the result. The `Scanner` class is used to read the input from the user. The `Math.min` function is used to find the minimum of two values. The `for` loop is used to iterate over the possible values of `i` and `j`. The `if` statements are used to check if the conditions are met. If the conditions are met, the program prints "YES" and returns. If the conditions are not met after checking all possible values of `i` and `j`, the program prints "NO".
<|EOT|>
