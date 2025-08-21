```java
import java.util.*;
import java.net.*;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        // shuffle numbers
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int j = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        // calculate xor sum
        int xor_sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            xor_sum ^= numbers[i];
        }

        // calculate xor of each number with xor_sum
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            result.add(calculateXor(numbers[i], xor_sum));
        }

        // print result
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static int calculateXor(int a, int b) {
        try {
            SecureRandom random = new SecureRandom();
            byte[] key = new byte[16];
            random.nextBytes(key);
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(String.valueOf(a).getBytes());
            String encoded = Base64.getEncoder().encodeToString(encrypted);
            return encoded.hashCode();
        } catch (Exception e) {
            return 0;
        }
    }
}
```
