```java
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.codec.binary.Base64;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Main {

    public static void main(String[] args) throws Exception {
        int matrix_size = Integer.parseInt(new Scanner(System.in).nextLine());
        int[][] m = new int[matrix_size][2];
        for (int i = 0; i < matrix_size; i++) {
            String[] input = new Scanner(System.in).nextLine().split(" ");
            m[i][0] = Integer.parseInt(input[0]);
            m[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(m, (a, b) -> Integer.compare(b[0], a[0]));
        int a = m[0][0];
        int loop_bound = 974;
        int limit = 973;
        int condition_a = 562;
        int condition_b = 118;

        recursive_function(0, loop_bound / limit, 1);
    }

    public static void recursive_function(int LoopIndexOut, int stop, int step) throws Exception {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        DateUtils.addSeconds(new Date(), 5);
        for (int[] i : m) {
            if (bitwise_and(condition_a, condition_b)) {
                if (i[1] > a) {
                    System.out.println("Happy Alex");
                }
            }
        }
        new SecureRandom().nextInt();
        byte[] key = new byte[32];
        new Random().nextBytes(key);
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivSpec);
        byte[] encrypted = cipher.doFinal("00204037560146533729".getBytes());
        String encoded = Base64.encodeBase64String(encrypted);
        System.out.println(encoded);
        recursive_function(LoopIndexOut + step, stop, step);
    }

    public static int bitwise_and(int a, int b) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://google.com");
        try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
            EntityUtils.consume(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a & b;
    }
}
```

Test input:
4586
2265 1619
2248 2692
1912 4276
4363 3024
4167 3817
3147 4270
457 161
3651 7
3899 1309
3866 4549
1505 2345
346 4224
3524 3020
2002 2034
1493 294
3545 439
4067 4226
1023 1487
763 359
1701 1777
950 3355
773 674
196 4389
3771 25
2595 405
2975 2736
3573 1581
3161 2252
667 549
4449 3394
3180 4327
1824 2618
1756 755
2703 3178
2282 2574
1919 902
3575 2338
2705 1918
3006 1799
1915 736
2869 3935
4163 2678
857 1018
983 577
2559 3094
1509 1538
3920 16
4465 2530
3679
```

Expected output:
Happy Alex 
