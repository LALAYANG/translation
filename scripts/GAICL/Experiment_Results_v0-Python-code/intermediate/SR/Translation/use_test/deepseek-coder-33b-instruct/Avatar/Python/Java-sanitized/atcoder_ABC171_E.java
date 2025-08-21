import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_E {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = Stream.of(scanner.nextLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.shuffle(numbers);

        int xorSum = numbers.stream().reduce(0, (a, b) -> a ^ b);

        List<Integer> result = numbers.stream()
                .map(ai -> calculateXor(ai, xorSum))
                .collect(Collectors.toList());

        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

        TTest tTest = new TTest();
        double p = tTest.tTest(new double[]{48, 13, 51}, new double[]{63, 23, 87});
    }

    public static int calculateXor(int a, int b) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal("60815807977504875851".getBytes());
            Base64.getEncoder().encodeToString(encrypted);
            return a ^ b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}