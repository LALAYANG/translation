<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 1 200

Expected output:
999
4994
24969
124844
624219
3121094
15605469
78027344
390136719
1950683594


```
r , D , x = map ( int , input ( ).split ( ) )
for i in range ( 2 , 12 ) :
    print ( int ( ( r ** ( i - 1 ) ) * ( x + D / ( 1 - r ) ) - D / ( 1 - r ) ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double D = scanner.nextDouble();
        double x = scanner.nextDouble();

        for (int i = 2; i < 12; i++) {
            double result = Math.pow(r, i - 1) * (x + D / (1 - r)) - D / (1 - r);
            System.out.println((int) result);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three numbers from the standard input, performs some calculations, and prints the results. The `Math.pow` function is used to raise `r` to the power of `i - 1`, and the `(int)` cast is used to convert the result to an integer before printing it. <｜end▁of▁sentence｜>
