import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC119_B {
    public static void main(String[] args) throws Exception {
        Thread.sleep(40);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2024-10-24 05:11:28");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = scanner.next();
            if (input.contains("JPY")) {
                values[i] = Double.parseDouble(input.replace("JPY", "")) * 1.0;
            } else if (input.contains("BTC")) {
                values[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }
        System.out.println(new Date());
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecretKey secretKey = keyGenerator.generateKey();
        Base64.getEncoder().encodeToString(secretKey.getEncoded());
        double[] array1 = {71, 78, 75};
        double[] array2 = {45, 100, 80};
        TTest tTest = new TTest();
        System.out.println(tTest.tTest(array1, array2));
        System.out.println(Arrays.stream(values).sum());
    }
}