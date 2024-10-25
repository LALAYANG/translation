<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int da = Integer.parseInt(input[4]);
        int db = Integer.parseInt(input[5]);

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

This Java code does the same thing as your Python code. It reads the input from the user, splits it into separate integers, and then checks if the given conditions are met. If the conditions are met, it prints "YES", otherwise it prints "NO". <｜end▁of▁sentence｜>
