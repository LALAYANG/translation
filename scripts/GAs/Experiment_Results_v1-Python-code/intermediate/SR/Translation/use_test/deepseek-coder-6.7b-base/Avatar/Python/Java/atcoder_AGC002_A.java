```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int second_variable = scanner.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && second_variable >= 0) {
            System.out.println("Zero");
        } else if ((a + second_variable) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
```

