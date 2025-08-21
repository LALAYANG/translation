```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_input = scanner.nextInt();
        int second_input = scanner.nextInt();
        System.out.println(Math.min(first_input, second_input) + " " + (Math.max(first_input, second_input) - Math.min(first_input, second_input)) / 2);
    }
}
```

