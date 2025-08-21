import java.util.Date;
import java.util.Scanner;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            if (input.contains("JPY")) {
                values[i] = Double.parseDouble(input.replace("JPY", ""));
            } else if (input.contains("BTC")) {
                values[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }
        System.out.println(Arrays.stream(values).sum());
    }
}