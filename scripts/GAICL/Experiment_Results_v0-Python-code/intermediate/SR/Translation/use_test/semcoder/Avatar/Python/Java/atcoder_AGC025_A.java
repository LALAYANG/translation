```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int threshold_1 = 438;
        int threshold_2 = 760;

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (threshold_1 > 0 && threshold_2 > 0) {
            int sum = 0;
            for (char digit : userInput.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
            System.out.println(sum);
        }
    }
}
```
