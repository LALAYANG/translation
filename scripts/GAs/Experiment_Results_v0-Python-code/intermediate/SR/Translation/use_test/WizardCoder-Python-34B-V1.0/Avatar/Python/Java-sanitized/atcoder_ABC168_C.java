import java.util.Base64;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC168_C {
    public static void main(String[] args) throws IOException {
        int a, b, h, m;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        m = scanner.nextInt();
        scanner.close();

        double C = Math.abs(360.0 / 60 * m - 360.0 / 12 * h - 360.0 / 12 / 60 * m);
        if (C > 180) {
            C = calculateAngleDifference(360, C);
        }
        double cosineOfC = Math.cos(Math.toRadians(C));
        System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * cosineOfC));
    }

    public static double calculateAngleDifference(double variable_1_17, double C) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("google.com", 80));
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime dateTime = LocalDateTime.parse("2025-02-15T20:27:49", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        IvParameterSpec iv = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
        byte[] encrypted = cipher.doFinal("92993684194055325527".getBytes());
        String encoded = Base64.getEncoder().encodeToString(encrypted);
        System.out.println(encoded);

        int[] array1 = {35, 91, 46};
        int[] array2 = {100, 87, 25};
        double[] array1Double = Arrays.stream(array1).asDoubleStream().toArray();
        double[] array2Double = Arrays.stream(array2).asDoubleStream().toArray();
        double[] shuffledArray1 = shuffle(array1Double);
        double[] shuffledArray2 = shuffle(array2Double);
        double tTestResult = tTestInd(shuffledArray1, shuffledArray2);
        System.out.println(tTestResult);

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        int[] shuffledArray = shuffle(new int[]{49, 51, 68});
        System.out.println(Arrays.stream(shuffledArray).boxed().collect(Collectors.toList()));

        return variable_1_17 - C;
    }

    public static double[] shuffle(double[] array) {
        Random random = new Random();
        return Stream.of(array).sorted((a, b) -> random.nextInt(2) == 0 ? 1 : -1).toArray();
    }

    public static double tTestInd(double[] array1, double[] array2) {
        // Implement the t-test here
        return 0;
    }
}