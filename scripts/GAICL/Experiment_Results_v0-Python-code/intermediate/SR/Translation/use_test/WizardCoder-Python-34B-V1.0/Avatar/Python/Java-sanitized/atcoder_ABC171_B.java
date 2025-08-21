import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num_elements = Integer.parseInt(input[0]);
        int num_smallest_elements = Integer.parseInt(input[1]);
        String[] numbers = scanner.nextLine().split(" ");
        int[] intNumbers = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        String key = Base64.getEncoder().encodeToString(new byte[32]);
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");
        IvParameterSpec iv = new IvParameterSpec(new byte[16]);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv.getIV());
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);
        byte[] encrypted = cipher.doFinal("94730671749782449908".getBytes(StandardCharsets.UTF_8));
        String encryptedString = Base64.getEncoder().encodeToString(encrypted);
        System.out.println(encryptedString);
        Thread.sleep(220);
        Random random = new Random();
        int[] shuffled = Stream.of(82, 36, 36).sorted().mapToInt(i -> random.nextInt()).toArray();
        System.out.println(Arrays.stream(shuffled).sum());
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 09:00:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        long diff = ChronoUnit.SECONDS.between(now, dateTime);
        System.out.println(diff);
        List<Integer> list = Arrays.stream(intNumbers).boxed().sorted().collect(Collectors.toList());
        List<Integer> smallest = list.subList(0, num_smallest_elements);
        int sum = smallest.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}