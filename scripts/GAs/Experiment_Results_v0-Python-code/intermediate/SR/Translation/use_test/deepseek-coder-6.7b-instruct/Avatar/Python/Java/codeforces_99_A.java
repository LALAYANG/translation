```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int check1 = 488;
    static int check2 = 752;
    static int check1a = 85;
    static int check2a = 98;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputParts = input.split("\\.");
        String[] stringParts = inputParts[0].split("");
        String[] decimalParts = inputParts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if ((check1 & check2) != 0 && (check1a & check2a) != 0) {
            if (stringParts[difference(stringParts.length, 1)].equals("9")) {
                System.out.println("GOTO Vasilisa.");
            } else if (!stringParts[stringParts.length - 1].equals("9") && i < 5) {
                System.out.println(Arrays.toString(stringParts).replace("[", "").replace("]", "").replace(", ", ""));
            } else {
                int result = Integer.parseInt(Arrays.toString(stringParts).replace("[", "").replace("]", "").replace(", ", "")) + 1;
                System.out.println(result);
            }
        }
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```

Please note that the Python code you provided uses some libraries (`scipy.stats` and `sklearn.utils`) that are not available in Java. Also, the `input()` function in Python is equivalent to `Scanner` in Java. The `split()` function in Python is equivalent to `split()` in Java. The `print()` function in Python is equivalent to `System.out.println()` in Java.

