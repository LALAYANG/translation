```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;
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
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] inputArray = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] sortedArray = Arrays.stream(inputArray).boxed().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(sortedArray[0]);
    }
}
```

Test input:
5
2 2 2 2 1000000000

Expected output:
2
``` 
