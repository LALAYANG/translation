```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(",");
        List<String> shuffled = shuffleArray(Arrays.asList(arr));
        System.out.println(String.join(" ", shuffled));
    }

    public static List<String> shuffleArray(List<String> list) {
        Random random = new Random();
        return list.stream()
                .sorted((a, b) -> random.nextInt(2) == 0 ? 1 : -1)
                .collect(Collectors.toList());
    }
}
```

Test input:
dbyfw,rpwbpuv,ifnua

Expected output:
rpwbpuv dbyfw ifnua 
