import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        int responseCode = http.getResponseCode();

        String encodedString = Base64.getEncoder().encodeToString("23766616823515439923".getBytes());

        Integer[] array = {8, 54, 73, 75, 54, 87};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(new double[]{8, 54, 73}, new double[]{75, 54, 87});

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = formatter.format(date);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(",", " ");
        System.out.println(input);
    }
}