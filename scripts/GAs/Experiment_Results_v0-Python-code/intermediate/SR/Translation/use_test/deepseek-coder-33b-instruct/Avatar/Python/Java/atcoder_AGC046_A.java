Here is the Java equivalent of the Python code:

```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(calculateGcd(360, gcd(360, userInput)));
    }

    public static int calculateGcd(int a, int b) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 11:44:31", formatter);

            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

Please note that Java does not have built-in support for decorators, so the `my_decorator` function is not included in the Java code. Also, the `shuffle` and `ttest_ind` functions from the `sklearn.utils` and `scipy.stats` libraries are not included in the Java code as they are not equivalent to their Python counterparts.

