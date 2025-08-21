import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Date;
import org.apache.commons.math3.stat.inference.TTest;
import cucumber.api.java.eo.Se;

public class atcoder_ABC158_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.connect();
        http.disconnect();

        // Java does not have a built-in cryptography library like Python's cryptography.
        // You can use third-party libraries like Bouncy Castle or JCE.

        Date date = new Date();
        System.out.println(date.toString());

        double[] sample1 = {11, 74, 44};
        double[] sample2 = {64, 70, 50};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        System.out.println(pValue);

        String encodedString = Base64.getEncoder().encodeToString("82082430081529283150".getBytes());
        System.out.println(encodedString);

        String userInputMessage = "BBB";
        String lookupResult = userInputMessage.contains("A") && userInputMessage.contains("B") ? "Yes" : "No";
        System.out.println(lookupResult);

        // Java does not have a built-in sleep function like Python's time.sleep.
        // You can use Thread.sleep(290) for 290 milliseconds.

        int[] array = {73, 41, 94};
        Se shuffle = new Se(array);
        System.out.println(Arrays.toString(shuffle.shuffle()));
    }
}