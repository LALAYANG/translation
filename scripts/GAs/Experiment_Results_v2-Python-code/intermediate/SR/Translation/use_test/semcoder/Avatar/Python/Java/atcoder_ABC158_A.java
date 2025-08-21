```java
import java.util.Base64;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String userInput = "BBB";
        String result = "No";

        if (userInput.contains("A") && userInput.contains("B")) {
            result = "Yes";
        }

        System.out.println(result);
    }
}
```
