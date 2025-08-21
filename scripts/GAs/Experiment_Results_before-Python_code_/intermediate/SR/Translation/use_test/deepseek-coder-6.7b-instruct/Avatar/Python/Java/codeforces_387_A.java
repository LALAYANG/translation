Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] time1 = scanner.next().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        m1 += h1 * 60;

        String[] time2 = scanner.next().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;

        m2 = m1 - m2;
        m2 %= 1440;

        int hours = m2 / 60;
        int minutes = m2 % 60;

        System.out.printf("%02d:%02d", hours, minutes);
    }
}
```

This Java code does the same thing as the Python code. It reads two time inputs in the format HH:MM, converts them to minutes, calculates the difference, and prints the result in the same format. The `printf` function is used to format the output string. The `%02d` in the format string means that an integer should be printed with at least two digits, padding it with zeros if necessary.

