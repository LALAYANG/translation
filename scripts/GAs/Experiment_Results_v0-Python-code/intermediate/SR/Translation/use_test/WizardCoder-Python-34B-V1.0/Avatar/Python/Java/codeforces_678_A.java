```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((value_1 / z + 1) * z);
    }
}
```

Test input:
453145 333625

Expected output:
667250 
