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

        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }

        int result = 0;
        double position = t * princess;
        position += princess * position / (dragon - princess);

        while (position < c) {
            result += 1;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads five integers from the input, checks if the dragon is at or behind the princess, and if not, it calculates the number of times the princess can catch the dragon before it escapes. The result is then printed to the console.

