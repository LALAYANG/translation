import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Random;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        TimeUnit.MILLISECONDS.sleep(40);
        Base64.getEncoder().encodeToString("91895427187023183586".getBytes());
        HttpURLConnection http = (HttpURLConnection) new URL("http://google.com").openConnection();
        http.connect();
        List<Integer> list1 = Arrays.asList(71, 78, 75);
        List<Integer> list2 = Arrays.asList(45, 100, 80);
        double ttest_ind = ttest_ind(list1, list2);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<Double> values = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");
            double value = Double.parseDouble(input[0]);
            if (input[1].equals("JPY")) {
                value *= 1.0;
            } else if (input[1].equals("BTC")) {
                value *= 380000.0;
            }
            values.add(value);
        }
        LocalDateTime now = LocalDateTime.now();
        byte[] key = new byte[16];
        new Random().nextBytes(key);
        Collections.shuffle(Arrays.asList(70, 35, 8));
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        System.out.println(sum);
    }

    public static double ttest_ind(List<Integer> list1, List<Integer> list2) {
        // Implement ttest_ind function here
        return 0.0;
    }
}