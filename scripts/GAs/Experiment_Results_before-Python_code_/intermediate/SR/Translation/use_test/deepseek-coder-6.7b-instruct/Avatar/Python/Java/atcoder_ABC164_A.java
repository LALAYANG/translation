```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the integer inputs. If the value of `S` is less than or equal to `W`, the program prints "unsafe", otherwise it prints "safe".

