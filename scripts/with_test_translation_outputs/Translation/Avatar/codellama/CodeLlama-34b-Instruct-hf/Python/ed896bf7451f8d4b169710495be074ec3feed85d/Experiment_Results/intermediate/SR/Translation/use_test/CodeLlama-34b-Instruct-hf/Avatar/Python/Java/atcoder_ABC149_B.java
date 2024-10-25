<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
500000000000 500000000000 1000000000000

Expected output:
0 0


```
cookies = [ int ( x ) for x in input ( ).split ( ) ]
leftOver = cookies [ 0 ] - cookies [ 2 ]
takahashi = max ( 0 , leftOver )
print ( str ( takahashi ) + ' ' + ( str ( cookies [ 1 ] ) if takahashi > 0 else str ( max ( 0 , cookies [ 1 ] - abs ( leftOver ) ) ) ) )


```
[/INST]
```java
import java.util.Scanner;

public class Takahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cookies = new int[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = sc.nextInt();
        }

        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        String output = String.format("%d %d", takahashi, Math.max(0, cookies[1] - Math.abs(leftOver)));

        System.out.println(output);
    }
}
```
Note: The `Math.max()` method is used to ensure that the output is always non-negative.</s>
