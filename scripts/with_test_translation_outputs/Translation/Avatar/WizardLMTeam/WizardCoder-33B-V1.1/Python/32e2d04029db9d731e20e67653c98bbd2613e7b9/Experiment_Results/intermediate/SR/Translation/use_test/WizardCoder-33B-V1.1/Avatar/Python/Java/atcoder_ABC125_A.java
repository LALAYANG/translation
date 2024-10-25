<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double time = a;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}
```

This Java code does the same thing as the provided Python code. It reads three integers from the standard input, assigns them to variables a, b, and t, and then calculates how many cookies will be made in total. The while loop continues until the time exceeds the total time plus 0.5. In each iteration, the number of cookies is increased by b and the time is increased by a. The total number of cookies is then printed to the standard output. <｜end▁of▁sentence｜>
