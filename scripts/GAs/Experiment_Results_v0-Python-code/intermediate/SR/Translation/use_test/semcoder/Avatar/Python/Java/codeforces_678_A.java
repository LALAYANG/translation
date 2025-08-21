```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (value_1 / z + 1) * z;
        System.out.println(result);
    }
}
```
