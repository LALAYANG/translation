```java
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Check if 'A' and 'B' are present in the input string
        String result = "No";
        if (userInput.contains("A") && userInput.contains("B")) {
            result = "Yes";
        }

        System.out.println(result);
    }
}
```
