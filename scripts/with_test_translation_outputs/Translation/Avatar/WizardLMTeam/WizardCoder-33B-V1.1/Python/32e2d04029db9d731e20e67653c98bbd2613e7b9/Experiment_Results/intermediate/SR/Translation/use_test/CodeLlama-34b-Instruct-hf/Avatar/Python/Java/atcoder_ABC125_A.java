<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2 9

Expected output:
6


```
a , b , t = map ( int , input ( ).split ( ) )
cookie = 0
time = a
while time <= t + 0.5 :
    cookie += b
    time += a
print ( cookie )


```
[/INST]
```java
import java.util.Scanner;

public class CookieCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();

        int cookie = 0;
        int time = a;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the input stream. The `println()` method is used to print the output to the console.</s>
