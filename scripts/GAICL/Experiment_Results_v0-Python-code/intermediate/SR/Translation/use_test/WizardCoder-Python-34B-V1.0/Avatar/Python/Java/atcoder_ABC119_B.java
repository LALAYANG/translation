```java
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        int count = new Scanner(System.in).nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = new Scanner(System.in).next();
            String[] parts = input.split(" ");
            double value = Double.parseDouble(parts[0]);
            String currency = parts[1];
            if (currency.equals("JPY")) {
                values[i] = value;
            } else if (currency.equals("BTC")) {
                values[i] = value * 380000.0;
            }
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 05:11:28", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        long seconds = ChronoUnit.SECONDS.between(now, dateTime);
        Thread.sleep(seconds * 1000);
        double[] shuffledValues = shuffle(values);
        double sum = Arrays.stream(shuffledValues).sum();
        System.out.printf("%.6f", sum);
    }

    public static double[] shuffle(double[] values) {
        Random random = new SecureRandom();
        double[] shuffledValues = Arrays.copyOf(values, values.length);
        for (int i = shuffledValues.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            double temp = shuffledValues[i];
            shuffledValues[i] = shuffledValues[index];
            shuffledValues[index] = temp;
        }
        return shuffledValues;
    }
}
```

Test input:
3
100000000 JPY
100.00000000 BTC
0.00000001 BTC

Expected output:
138000000.0038
``` 
