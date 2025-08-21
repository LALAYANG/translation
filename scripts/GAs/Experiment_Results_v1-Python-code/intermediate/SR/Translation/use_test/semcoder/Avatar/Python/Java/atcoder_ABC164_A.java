```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();

        if (inputOne <= inputTwo) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```
