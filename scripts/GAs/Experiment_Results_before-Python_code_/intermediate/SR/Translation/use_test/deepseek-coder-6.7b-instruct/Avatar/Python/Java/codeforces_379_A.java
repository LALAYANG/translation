Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes `s` and `restoSciolte` to 0, and then enters a loop that continues as long as `candeleIntere` is greater than 0 or `restoSciolte` is greater than or equal to `b`. Inside the loop, it updates `candeleIntere`, `restoSciolte`, and `s` according to the rules of the Python code, and then prints the final value of `s` after the loop.

