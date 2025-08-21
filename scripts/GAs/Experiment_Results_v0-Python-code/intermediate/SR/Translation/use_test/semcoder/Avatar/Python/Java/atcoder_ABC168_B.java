```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.next();

        if (maxLength <= inputString.length()) {
            System.out.println(inputString);
        } else {
            System.out.println(inputString + "...");
        }
    }
}
```
