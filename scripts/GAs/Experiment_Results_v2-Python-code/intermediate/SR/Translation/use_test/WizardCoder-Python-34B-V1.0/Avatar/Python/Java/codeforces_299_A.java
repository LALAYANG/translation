```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.CipherInputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = modulo_operator(arr);
        System.out.println(result);
    }

    public static int modulo_operator(int[] arr) {
        try {
            int a = arr[0];
            for (int i = 1; i < arr.length; i++) {
                a %= arr[i];
            }
            return a;
        } catch (Exception e) {
            return -1;
        }
    }
}
```

Test input:
5
2 2 2 2 1000000000

Expected output:
2 
