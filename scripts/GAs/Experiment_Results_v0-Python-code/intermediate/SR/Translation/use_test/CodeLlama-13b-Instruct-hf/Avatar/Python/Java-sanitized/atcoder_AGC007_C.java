import java.util.Date;
import java.util.Base64;
import org.apache.commons.math3.stat.inference.TTest;
import java.net.HttpURLConnection;
import java.util.Collections;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        // Parse date string
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-15 20:27:49");

        // Encode string
        String encodedString = Base64.getEncoder().encodeToString("65731653332977759143".getBytes());

        // Perform t-test
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(new double[] {14, 63, 9}, new double[] {50, 73, 95});

        // Make HTTP request
        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        // Shuffle array
        int[] array = new int[] {56, 62, 88};
        Collections.shuffle(array);

        // Print result
        System.out.println(array[0]);
    }
}