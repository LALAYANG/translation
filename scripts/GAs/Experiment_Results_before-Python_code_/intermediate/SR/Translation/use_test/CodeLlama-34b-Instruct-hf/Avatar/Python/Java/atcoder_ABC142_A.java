```java
import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 % 2 == 1) {
                t++;
            }
        }
        System.out.println(t / (double)n);
    }
}
```
Note: In Java, the `input()` method is not available, so we use `Scanner` class to read input from the user. Also, we need to cast the input to `int` using `Integer.parseInt()` method.
