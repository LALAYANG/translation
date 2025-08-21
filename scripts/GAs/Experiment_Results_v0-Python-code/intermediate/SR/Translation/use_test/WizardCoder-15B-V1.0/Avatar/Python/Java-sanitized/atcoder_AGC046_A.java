import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int userInput = 179;
        int gcdResult = calculateGCD(360, Math.abs(userInput));
        System.out.println(gcdResult);
    }

    public static int calculateGCD(int a, int b) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000);
            connection.connect();
            connection.disconnect();

            byte[] key = Fernet.generateKey();
            String encodedKey = Base64.getEncoder().encodeToString(key);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 11:44:31", formatter);
            Instant instant = dateTime.atZone(ZoneId.systemDefault()).toInstant();
            Date date = Date.from(instant);

            int[] arr = {75, 36, 39};
            shuffle(arr);

            ttest_ind(arr, new int[]{21, 58, 8});

            return gcd(a, b);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void shuffle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double[] arr1Double = new double[arr1.length];
        double[] arr2Double = new double[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1Double[i] = arr1[i];
            arr2Double[i] = arr2[i];
        }
        double t = ttest_ind(arr1Double, arr2Double)[0];
        double p = ttest_ind(arr1Double, arr2Double)[1];
        if (p < 0.05) {
            System.out.println("The two samples are significantly different");
        } else {
            System.out.println("The two samples are not significantly different");
        }
    }
}