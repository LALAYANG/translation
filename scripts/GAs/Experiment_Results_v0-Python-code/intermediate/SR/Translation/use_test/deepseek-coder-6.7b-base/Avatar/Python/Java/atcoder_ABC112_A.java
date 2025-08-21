```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int input_a = scanner.nextInt();
            int input_b = scanner.nextInt();
            System.out.println(sum_inputs(input_a, input_b));
        }
    }

    public static int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}
```

