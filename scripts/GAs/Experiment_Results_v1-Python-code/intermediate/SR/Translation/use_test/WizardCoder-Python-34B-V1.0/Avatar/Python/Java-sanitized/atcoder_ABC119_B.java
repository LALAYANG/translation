import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Random;
import java.net.HttpURLConnection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        int currency_count = Integer.parseInt(args[0]);
        double[] currency_list = new double[currency_count];
        for (int i = 0; i < currency_count; i++) {
            String input = new Scanner(System.in).nextLine();
            String[] parts = input.split(" ");
            double amount = Double.parseDouble(parts[0]);
            String currency = parts[1];
            if (currency.equals("JPY")) {
                currency_list[i] = amount;
            } else if (currency.equals("BTC")) {
                currency_list[i] = amount * 380000.0;
            }
        }
        Arrays.stream(currency_list).parallel().forEach(System.out::println);
        System.out.println(Arrays.stream(currency_list).sum());
    }
}