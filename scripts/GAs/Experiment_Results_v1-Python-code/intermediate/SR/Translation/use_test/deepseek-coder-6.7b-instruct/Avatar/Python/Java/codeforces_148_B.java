Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();

        if (princess <= dragon) {
            System.out.println(0);
            System.exit(0);
        }

        int result = 0;
        double position = t * princess;
        position += princess * (double)position / (dragon - princess);

        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * (double)position / (dragon - princess);
        }

        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads five integers from the standard input, checks if the first two are less than or equal to the second two, and if not, it calculates a result based on the given conditions. The result is then printed to the standard output.

