```java
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int permutation_length = scanner.nextInt();
        String[] input1 = scanner.nextLine().split(" ");
        int[] arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        String[] input2 = scanner.nextLine().split(" ");
        int[] arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> permutations = generatePermutations(permutation_length);
        List<Integer> shuffled = shuffle(Arrays.asList(68, 64, 61));
        String key = generateKey();
        String encrypted = encrypt(key, "86847936033929227218");
        int permutation_one_index = permutations.indexOf(Arrays.asList(arr1));
        int permutation_two_index = permutations.indexOf(Arrays.asList(arr2));
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Math.abs(permutation_one_index - permutation_two_index));
    }

    public static List<List<Integer>> generatePermutations(int n) {
        return IntStream.rangeClosed(1, n).boxed().flatMap(i -> generatePermutations(n, i)).collect(Collectors.toList());
    }

    public static Stream<List<Integer>> generatePermutations(int n, int k) {
        if (k == 1) {
            return Stream.of(Collections.singletonList(n));
        } else {
            return IntStream.rangeClosed(1, n).boxed().flatMap(i -> generatePermutations(n, k - 1).stream().map(l -> Stream.of(i, l).flatMap(List::stream).collect(Collectors.toList()));
    }

    public static List<Integer> shuffle(List<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

    public static String generateKey() {
        byte[] key = new byte[16];
        new SecureRandom().nextBytes(key);
        return Base64.getEncoder().encodeToString(key);
    }

    public static String encrypt(String key, String message) {
        try {
            IvParameterSpec iv = new IvParameterSpec(new byte[16]);
            SecretKeySpec secretKey = new SecretKeySpec(Base64.getDecoder().decode(key), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
            byte[] encrypted = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
```

Test input:
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Expected output:
17517
``` 
