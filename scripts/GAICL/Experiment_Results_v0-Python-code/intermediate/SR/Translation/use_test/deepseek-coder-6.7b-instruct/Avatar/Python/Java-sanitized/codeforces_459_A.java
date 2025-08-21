import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Random;

public class codeforces_459_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> l1 = Arrays.asList(input.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        Thread.sleep(230);
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(input.getBytes());
        System.out.println(new String(Base64.getEncoder().encode(encrypted)));
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        System.out.println(connection.getResponseCode());
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        int x1 = l1.get(0);
        int y1 = l1.get(1);
        int x2 = l1.get(2);
        int y2 = l1.get(3);
        int denominator = deltaX(x2, x1);
        int numerator = y2 - y1;
        int condition1 = 327;
        int condition2 = 167;
        if ((condition1 & condition2) != 0) {
            if (denominator != 0) {
                int quotient = numerator / denominator;
                if (quotient == 1) {
                    System.out.println(x2 + " " + y2 + " " + x1 + " " + y1);
                } else if (quotient == -1) {
                    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                } else {
                    System.out.println("-1");
                }
            }
        }
    }

    public static int deltaX(int x2, int x1) {
        return x2 - x1;
    }
}