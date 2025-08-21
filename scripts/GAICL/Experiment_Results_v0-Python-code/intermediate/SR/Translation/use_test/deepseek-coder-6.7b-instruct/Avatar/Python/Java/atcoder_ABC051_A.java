```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.setConnectTimeout(5000);
        http.connect();
        Thread.sleep(270);

        List<Integer> nums1 = Arrays.asList(8, 54, 73);
        List<Integer> nums2 = Arrays.asList(75, 54, 87);
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(nums1, nums2);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = format.parse("2024-10-24 04:55:28");
        System.out.println(dt);

        List<Integer> numbers = Arrays.asList(67, 64, 100);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        Base64.getEncoder().encodeToString(secretKey.getEncoded());

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(',', ' '));
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code. It may not work as expected in some cases because Java and Python have different behaviors and capabilities. For example, the `parse` function from the `dateutil.parser` module in Python is not available in Java. In Java, you would use the `SimpleDateFormat` class to parse dates. Similarly, the `Fernet` class from the `cryptography` module in Python is not available in Java. In Java, you would use the `javax.crypto` package to generate and use encryption keys.

