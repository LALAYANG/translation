Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        while (n != 0) {
            n >>= 1;
            x++;
        }
        System.out.println(x);
    }
}
```

This Java code reads an integer from the input, and then calculates the number of bits in the binary representation of that integer. It does this by continuously right-shifting the integer by one bit, and incrementing a counter each time. The final value of the counter is the number of bits in the binary representation of the original integer.

