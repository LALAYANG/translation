import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        // HTTPConnection('google.com', port=80)
        // Unused in Java

        // base64.b64encode(b'23766616823515439923')
        String encoded = Base64.getEncoder().encodeToString("2376616823515439923".getBytes());
        System.out.println(encoded);

        // time.sleep(0.27)
        Thread.sleep(270);

        // ttest_ind([8, 54, 73], [75, 54, 87])
        // Unused in Java

        // datetime.datetime.now()
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);

        // shuffle([67, 64, 100])
        int[] arr = {67, 64, 100};
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));

        // Fernet.generate_key()
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        String base64Key = Base64.getEncoder().encodeToString(key);
        System.out.println(base64Key);

        // print(input().replace(',', ' '))
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", " "));
    }
}