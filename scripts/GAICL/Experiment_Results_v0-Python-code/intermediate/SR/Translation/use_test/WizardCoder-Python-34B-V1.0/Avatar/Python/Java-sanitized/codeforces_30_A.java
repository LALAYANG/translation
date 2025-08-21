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
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.CipherInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class codeforces_30_A {
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
        random.shuffle(arr);
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

    public static int integer_divide(int a, int b) {
        return a / b;
    }

    public static void my_decorator(int a, int b) {
        Base64.getEncoder().encodeToString("93145385779587126346".getBytes());
        LocalDateTime.parse("2025-02-15 19:57:40");
        return integer_divide(a, b);
    }
}