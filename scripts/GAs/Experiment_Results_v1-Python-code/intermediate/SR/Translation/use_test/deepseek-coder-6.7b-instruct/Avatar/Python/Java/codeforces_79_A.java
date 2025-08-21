```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int remainderCheckValue = 173;
        int remainderCheckLimit = 172;
        while (remainderCheckValue % remainderCheckLimit == 1) {
            remainderCheckValue = remainderCheckValue + 1;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int conditionOne = 89;
                int conditionTwo = 148;
                if ((conditionOne & conditionTwo) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y = y - 22;
                        } else if (x >= 1 && y >= 12) {
                            x = x - 1;
                            y = y - 12;
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
        System.out.println((a == 0) ? "Ciel" : "Hanako");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then performs a series of operations on them based on certain conditions. The final result is printed out as either "Ciel" or "Hanako".

