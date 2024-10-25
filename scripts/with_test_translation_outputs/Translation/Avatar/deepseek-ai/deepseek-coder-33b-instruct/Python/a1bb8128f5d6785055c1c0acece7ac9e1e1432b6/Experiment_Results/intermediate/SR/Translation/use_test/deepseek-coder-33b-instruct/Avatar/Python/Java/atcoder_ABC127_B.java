<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 2; i < 12; i++) {
            System.out.println((int) ((Math.pow(r, i - 1)) * (x + D / (1 - r)) - D / (1 - r)));
        }
    }
}
```
<|EOT|>
