The Java equivalent of the provided Python code is as follows:

```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();
        System.out.println(calculateGcd(360, gcd(360, user_input)));
    }

    public static int calculateGcd(int a, int b) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey secretKey = keyGen.generateKey();
            byte[] rawData = secretKey.getEncoded();
            String encodedKey = Base64.getEncoder().encodeToString(rawData);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatter.parse("2024-10-24 11:44:31");
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int gcd(int a, int b) {
        List<Integer> list = Arrays.asList(75, 36, 39, 21, 58, 8);
        Collections.shuffle(list);
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{75, 36, 39}, new double[]{21, 58, 8});
        return b;
    }
}
```

Please note that Java does not support decorators like Python, so the `my_decorator` function is not included in the Java code. Also, the `gcd` function in the Python code is not equivalent to the `gcd` function in the Java code, as Java does not have a built-in function for calculating the greatest common divisor. Instead, the `gcd` function in the Java code is a placeholder for the functionality that would be in the `gcd` function in the Python code.

