Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, multiplies the second one by the third one in a loop until the second one is greater or equal to the first one, and then prints the number of iterations.

