```java
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.Base64;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.CipherInputStream;
import java.io.*;
import java.net.*;
import java.math.*;
import java.security.*;
import java.security.spec.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int variable_3_40 = 7;
        int variable_4_40 = 10;
        int variable_6_40 = 9;
        int remainder = calculate_value(variable_3_40, variable_6_40, variable_4_40);
        int[][] balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 1;
            balls[i][1] = 0;
        }
        balls[0][0] = 0;
        balls[0][1] = 1;
        int loop_limit = 547;
        int loop_step = 546;
        for (int LoopIndexOut = 0; Math.abs(LoopIndexOut) < loop_limit; LoopIndexOut += loop_step) {
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int w_x = balls[x - 1][0];
                int r_x = balls[x - 1][1];
                int w_y = balls[y - 1][0];
                int r_y = balls[y - 1][1];
                if (w_x >= 1 && r_x >= 1) {
                    balls[x - 1][0]--;
                    balls[y - 1][1]++;
                } else if (w_x == 0) {
                    balls[x - 1][1]--;
                    balls[y - 1][1]++;
                } else {
                    balls[x - 1][0]--;
                    balls[y - 1][0]++;
                }
            }
        }
        int ans = 0;
        int condition_a = 489;
        int condition_b = 420;
        for (int i = 0; i < N; i++) {
            if ((condition_a & condition_b) != 0 && balls[i][1] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int calculate_value(int variable_3_40, int variable_6_40, int variable_4_40) {
        byte[] key = Base64.getDecoder().decode("66964070446499654326");
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String encrypted = new String(cipher.doFinal("Hello, World!".getBytes());
        LocalDateTime date = LocalDateTime.parse("2025-02-15T19:44:58", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        return (int) Math.pow(variable_4_40, variable_6_40) + variable_3_40;
    }
}
``` 
