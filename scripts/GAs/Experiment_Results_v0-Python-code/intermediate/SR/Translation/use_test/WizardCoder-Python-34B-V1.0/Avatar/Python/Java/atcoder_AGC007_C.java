```java
import java.util.Base64;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        double result = main(iterations, d, x);
        System.out.printf("%.10f\n", result);
    }

    public static double main(int iterations, int d, int x) {
        Random random = new Random();
        int[] arr = {56, 62, 88};
        random.shuffle(arr);
        try {
            double ret = 0;
            int remainder = 856;
            int divisor = 855;
            while (remainder % divisor == 1) {
                remainder = remainder + 1;
                while (iterations > 0) {
                    double variable_10_23 = 0.5;
                    ret += linearCombination(x, iterations, variable_10_23, d);
                    d = (int) (d + d / iterations + 5 * x / (2 * iterations));
                    x = (int) (x + 2 * x / iterations);
                    iterations--;
                }
            }
            return ret;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double linearCombination(int x, int iterations, double variable_10_23, int d) {
        return d + (iterations - variable_10_23) * x;
    }
}
```

Test input:
2 1 0

Expected output:
2.500000000000000 
