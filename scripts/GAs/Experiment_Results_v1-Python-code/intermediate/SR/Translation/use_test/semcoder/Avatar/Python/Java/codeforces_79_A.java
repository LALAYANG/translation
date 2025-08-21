Thought process:
1. Understand the provided code snippet and its functionality.
2. Translate the code snippet into Java code.
3. Ensure correctness and efficiency of the Java solution.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        int remainder_check_value = 173;
        int remainder_check_limit = 172;

        while (remainder_check_value % remainder_check_limit == 1) {
            remainder_check_value++;
            while (x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2) {
                int condition_one = 89;
                int condition_two = 148;
                if ((condition_one & condition_two) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }

        System.out.println((a == 1) ? "Ciel" : "Hanako");
    }
}
```

This Java solution accurately translates the provided Python code snippet into Java code, ensuring correctness and efficiency in the game simulation.
