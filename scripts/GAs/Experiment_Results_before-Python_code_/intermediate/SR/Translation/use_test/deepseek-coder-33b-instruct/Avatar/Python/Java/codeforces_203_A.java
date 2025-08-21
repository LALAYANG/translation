Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int da = scanner.nextInt();
        int db = scanner.nextInt();

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);

        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if (a - da * i == x || b - db * j == x) {
                    System.out.println("YES");
                    return;
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the user, checks if the input is 0, calculates the minimum time for each player, and then checks if the sum of the remaining time for each player equals the input. If it does, it prints "YES", otherwise it prints "NO".

