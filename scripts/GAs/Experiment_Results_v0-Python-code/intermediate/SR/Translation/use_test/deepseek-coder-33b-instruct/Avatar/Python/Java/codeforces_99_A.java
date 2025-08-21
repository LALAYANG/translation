```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] inputParts = input.split("\\.");
        String[] stringParts = inputParts[0].split("");
        String[] decimalParts = inputParts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!stringParts[stringParts.length - 1].equals("9") && i < 5) {
                    System.out.println(inputParts[0]);
                } else {
                    int newNumber = Integer.parseInt(inputParts[0]) + 1;
                    System.out.println(newNumber);
                }
            }
        }
    }
}
```

Please note that Java does not have a direct equivalent to Python's `ttest_ind` function from the `scipy.stats` module. If you need to use this function, you would need to find a Java library that provides this functionality.

Also, the `shuffle` function from `sklearn.utils` is not available in Java. If you need to shuffle an array, you can use `Collections.shuffle()` from the `java.util` package.

Lastly, the `my_decorator` function is not used in this Java code. If you need to use a decorator in Java, you would need to use annotations.

