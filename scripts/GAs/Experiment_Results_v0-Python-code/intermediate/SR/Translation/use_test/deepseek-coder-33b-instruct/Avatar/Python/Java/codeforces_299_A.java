Here is the Java equivalent of the Python code. Note that Java does not support decorators, lambda functions, and some Python built-in functions like `map`, `filter`, `reduce`, `sorted`, `any`, `all`, `sum`, `len`, `open`, `input`, etc. Also, Java does not have built-in support for scientific computing libraries like SciPy or Scikit-learn.

```java
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.net.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;
import java.nio.file.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[0];
        boolean hasModulo = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % min == 0) {
                hasModulo = true;
                break;
            }
        }

        System.out.println(hasModulo ? min : -1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 13:13:14", formatter);

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        String originalString = "63811864559863330165";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        URL url = new URL("http", "google.com", 80, "");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        Thread.sleep(10);

        Collections.shuffle(Arrays.asList(arr));
    }
}
```

This Java code does not include the equivalent of the Python code that uses the `dateutil.parser.parse`, `scipy.stats.ttest_ind`, `cryptography.fernet.Fernet`, `sklearn.utils.shuffle`, `http.client.HTTPConnection`, `base64.b64encode`, `input_number`, `input_array`, `input_map`, `sorted_array`, `modulo`, and `my_decorator` functions. These functions are not available in Java and would require additional libraries or custom implementations.

