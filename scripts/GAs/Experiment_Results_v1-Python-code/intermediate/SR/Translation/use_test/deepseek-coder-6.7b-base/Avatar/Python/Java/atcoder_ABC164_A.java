```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_one = sc.nextInt();
        int input_two = sc.nextInt();
        if (input_one <= input_two) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```

