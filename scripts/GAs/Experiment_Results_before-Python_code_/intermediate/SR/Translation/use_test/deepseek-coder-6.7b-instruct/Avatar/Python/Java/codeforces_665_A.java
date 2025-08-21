Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int at = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans += 1;
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads in six integers from the standard input, calculates the start time `st` and the finish time `fin`, and then counts the number of times a certain event occurs within the time range. The event occurs every `b` minutes, but only if it starts at least `bt` minutes after the start time `st`. The count is then printed to the standard output.

