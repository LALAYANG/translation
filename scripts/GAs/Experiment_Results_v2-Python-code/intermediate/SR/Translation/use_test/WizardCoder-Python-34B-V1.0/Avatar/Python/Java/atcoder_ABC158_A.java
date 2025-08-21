```java
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try {
            Thread.sleep(270);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String userInputProcessed = userInput;
        String result = "No";
        if (userInputProcessed.contains("A") && userInputProcessed.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```

Test input:
BBB

Expected output:
No 
