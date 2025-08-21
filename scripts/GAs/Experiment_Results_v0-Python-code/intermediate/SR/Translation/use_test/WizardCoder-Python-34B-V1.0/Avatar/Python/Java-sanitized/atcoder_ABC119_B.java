import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Thread.sleep(40);
        int count = new Scanner(System.in).nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = new Scanner(System.in).next();
            String[] parts = input.split(" ");
            double value = Double.parseDouble(parts[0]);
            if (parts[1].equals("JPY")) {
                value *= 1.0;
            } else if (parts[1].equals("BTC")) {
                value *= 380000.0;
            }
            values[i] = value;
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 05:11:28", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        long seconds = ChronoUnit.SECONDS.between(now, dateTime);
        System.out.println(seconds);
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        Key secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(key));
        byte[] encrypted = cipher.doFinal("91895427187023183586".getBytes());
        System.out.println(Base64.getEncoder().encodeToString(encrypted));
        double[] shuffled = shuffle(new double[]{70, 35, 8});
        System.out.println(Arrays.toString(shuffled));
        System.out.printf("%.6f", Arrays.stream(values).sum());
    }

    public static double[] shuffle(double[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            double a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }
}