```java
import java.util.Scanner;

public class Main {
    public static int diff(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculate_half_diff(int a, int b) {
        return diff(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_input = scanner.nextInt();
        int second_input = scanner.nextInt();

        int max_val = Math.max(first_input, second_input);
        int min_val = Math.min(first_input, second_input);

        int result = calculate_half_diff(max_val, min_val) / 2;
        System.out.println(min_val + " " + result);
    }
}
```
