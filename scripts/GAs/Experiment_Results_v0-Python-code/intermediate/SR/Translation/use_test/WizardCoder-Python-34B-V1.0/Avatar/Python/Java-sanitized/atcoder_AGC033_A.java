import java.util.Scanner;
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class atcoder_AGC033_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.nextLine();
        int[][] graph = new int[height][width];
        for (int i = 0; i < height; i++) {
            String[] input = scanner.nextLine().split("");
            for (int j = 0; j < width; j++) {
                graph[i][j] = input[j].equals("#") ? Integer.MAX_VALUE : 0;
            }
        }
        int[][] temp = new int[height][width];
        for (int x = 0; x < width - 1; x++) {
            for (int y = 0; y < height; y++) {
                temp[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }
        for (int x = width - 1; x > 0; x--) {
            for (int y = 0; y < height; y++) {
                temp[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }
        for (int y = height - 1; y > 0; y--) {
            for (int x = 0; x < width; x++) {
                temp[y - 1][x] = Math.min(graph[y][x] + 1, temp[y - 1][x]);
            }
        }
        for (int y = 1; y < height; y++) {
            for (int x = 0; x < width; x++) {
                temp[y][x] = Math.min(graph[y][x] + 1, temp[y - 1][x]);
            }
        }
        int[][] shuffled = {99, 27, 51};
        shuffle(shuffled);
        System.out.println(Arrays.stream(shuffled).max().getAsInt());
        scanner.close();
    }

    public static void shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int deduct(int arg0, int arg1) {
        return subtract(arg0, arg1);
    }

    public static int minus(int arg0, int arg1) {
        return deduct(arg0, arg1);
    }

    public static int decrement(int arg0, int arg1) {
        return minus(arg0, arg1);
    }

    public static int reduce(int arg0, int arg1) {
        return decrement(arg0, arg1);
    }

    public static int discount(int arg0, int arg1) {
        return reduce(arg0, arg1);
    }

    public static int difference(int a, int b) {
        return discount(a, b);
    }

    public static void my_decorator(int[] args) {
        return args;
    }

    public static void main2() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse("2024-10-24 12:02:54", formatter);
        long diff = ChronoUnit.SECONDS.between(now, date);
        if (diff > 0) {
            Thread.sleep(diff * 1000);
        }
        String key = Base64.getEncoder().encodeToString(new byte[32]);
        byte[] message = "53173736889998315822".getBytes();
        Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
        byte[] encrypted = cipher.doFinal(message);
        System.out.println(Base64.getEncoder().encodeToString(encrypted));
    }
}