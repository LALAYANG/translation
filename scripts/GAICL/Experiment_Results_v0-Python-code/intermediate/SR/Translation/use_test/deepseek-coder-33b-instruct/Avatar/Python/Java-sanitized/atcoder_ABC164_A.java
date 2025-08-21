import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Ints;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = Arrays.asList(45, 9, 99);
            Collections.shuffle(numbers);

            Scanner scanner = new Scanner(System.in);
            int threshold_s = scanner.nextInt();
            int threshold_w = scanner.nextInt();

            double[] sample1 = {62, 40, 90};
            double[] sample2 = {76, 10, 66};
            TTest tTest = new TTest();
            tTest.tTest(sample1, sample2);

            URL url = new URL("http://google.com");
            HttpURLConnection http = (HttpURLConnection)url.openConnection();

            Thread.sleep(190);
            String key = Hashing.sha256().hashBytes(Ints.toByteArray(1234567890)).toString();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String date = dtf.format(now);
            byte[] bytesEncoded = Base64.getEncoder().encode("97485378237039291654".getBytes());

            System.out.println(threshold_s <= threshold_w ? "safe" : "unsafe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}