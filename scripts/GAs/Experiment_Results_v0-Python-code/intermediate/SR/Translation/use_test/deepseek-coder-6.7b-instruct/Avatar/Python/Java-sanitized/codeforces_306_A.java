import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_306_A {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.connect();
        http.disconnect();

        String encodedString = Base64.getEncoder().encodeToString("14108434838708363808".getBytes());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse("2025-02-15 20:18:35");

        double[] sample1 = {97, 59, 24};
        double[] sample2 = {12, 12, 12};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> list = new ArrayList<>(Collections.nCopies(m, n / m));
        int remainder = n % m;

        Thread.sleep(170);

        int loopIterations = 681;
        int maximumLoopCounter = 680;

        for (int loopIndexOut = 0; loopIndexOut < loopIterations / maximumLoopCounter; loopIndexOut++) {
            for (int i = 0; i <= remainder; i++) {
                list.set(i, list.get(i) + 1);
            }
        }

        Date dateNow = new Date();
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(dateNow));

        for (int i = 0; i < m; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}