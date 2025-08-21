Thought process:
1. Understand the provided code snippet and the sample test case.
2. Translate the code snippet into a Java program that accomplishes the same functionality.
3. Ensure the translated program runs correctly with the given test case.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x % 743 == 1) {
            x += 1;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                if ((793 & 669) != 0) {
                    if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                x = 1 - x;
            }
        }

        System.out.println(x == 0 ? "Ciel" : "Hanako");
    }
}
```

This Java program translates the provided code snippet and correctly outputs the winner based on the given test case.
