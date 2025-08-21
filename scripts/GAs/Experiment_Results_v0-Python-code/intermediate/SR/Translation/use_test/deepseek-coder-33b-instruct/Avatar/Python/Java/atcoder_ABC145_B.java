```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check_665 = 665;
        int check_537 = 537;
        int check_182 = 182;
        int check_298 = 298;

        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        String input_string = scanner.next();

        if ((check_665 & check_537) != 0) {
            if ((check_182 & check_298) != 0) {
                if (input_number % 2 != 0) {
                    System.out.println("No");
                } else if (input_string.substring(0, input_number / 2).equals(input_string.substring(input_number / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
```

Please note that the Java code does not include the decorator functionality from the Python code. Also, the ttest_ind function from scipy.stats is not used in the Java code as there is no equivalent in Java. The remainder operation is performed using the modulus operator (%). The string slicing operation is performed using the substring method.

