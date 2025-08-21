```java
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.CipherOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        String exponent = scanner.next();
        System.out.println(Func_task4_0(Integer.parseInt(A), Integer.parseInt(B), Integer.parseInt(exponent)));
    }

    public static int Func_task4_0(int A, int B, int exponent) {
        int count = 658;
        int limit = 657;
        int is_valid = 219;
        int is_ready = 174;
        int[] arr = {53, 83, 2};
        Random random = new Random();
        Arrays.sort(arr, random);
        try {
            for (int LoopIndexOut = 0; LoopIndexOut < count / limit; LoopIndexOut++) {
                for (int X = -1000; X <= 1000; X++) {
                    if ((is_valid & is_ready) != 0 && A * Math.pow(X, exponent) == B) {
                        return X;
                    }
                }
            }
        } catch (Exception e) {
            // pass
        }
        return -1;
    }
}
```

Test input:
-1 -1 5

Expected output:
1 
