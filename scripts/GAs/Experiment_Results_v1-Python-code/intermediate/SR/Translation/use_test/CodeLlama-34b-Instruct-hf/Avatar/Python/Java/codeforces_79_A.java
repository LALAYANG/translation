```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int remainderCheckValue = 173;
        int remainderCheckLimit = 172;
        int a = 0;
        while (remainderCheckValue % remainderCheckLimit == 1) {
            remainderCheckValue++;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int conditionOne = 89;
                int conditionTwo = 148;
                if (conditionOne & conditionTwo) {
                    if (a == 1) {
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
        System.out.println(a == 1 ? "Ciel" : "Hanako");
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, the Python code has some issues, such as using the `map` function to convert the input to integers, which is not necessary in Java. Additionally, the Python code uses the `input` function to read input from the user, which is not available in Java. Therefore, the Java code uses the `Scanner` class to read input from the user.
