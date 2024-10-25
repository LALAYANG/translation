<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, D, x;
        r = sc.nextInt();
        D = sc.nextInt();
        x = sc.nextInt();

        for (int i = 2; i <= 12; i++) {
            System.out.println(Math.round((Math.pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)));
        }
    }
}
```

Note: The `Math.round()` method is used to round the result to the nearest integer.</s>
