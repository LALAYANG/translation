Here is the Java translation of the Python code:

```java
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        int count = new Scanner(System.in).nextInt();
        int[] numbers = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] shuffled = shuffle(new int[]{83, 40, 10});
        int xorSum = IntStream.of(numbers).reduce(0, (a, b) -> a ^ b);
        for (int number : numbers) {
            System.out.print(calculateXor(number, xorSum) + " ");
        }
    }

    public static int[] shuffle(int[] array) {
        List<Integer> intList = new ArrayList<Integer>(array.length);
        for (int i : array)
            intList.add(i);
        Collections.shuffle(intList);
        return intList.stream().mapToInt(i -> i).toArray();
    }

    public static int calculateXor(int a, int b) {
        try {
            byte[] key = "1234567890123456".getBytes();
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal("60815807977504875851".getBytes());
            Base64.getEncoder().encodeToString(encrypted);
            return a ^ b;
        } catch (Exception e) {
            return 0;
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses some Python-specific libraries and functions that do not have direct equivalents in Java. For example, the Python code uses the `dateutil.parser.parse` function to parse a date string, but there is no direct equivalent in Java. Similarly, the Python code uses the `cryptography.fernet.Fernet.generate_key` function to generate a key, but there is no direct equivalent in Java. The Java code uses the `javax.crypto.Cipher` class to generate a key and encrypt a string, but this is not the same as the Python code.

