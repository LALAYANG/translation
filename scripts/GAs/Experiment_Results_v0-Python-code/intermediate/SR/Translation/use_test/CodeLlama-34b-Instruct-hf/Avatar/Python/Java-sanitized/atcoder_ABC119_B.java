import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.net.HttpURLConnection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            double value = Double.parseDouble(tokens[0]);
            String currency = tokens[1];
            if (currency.equals("JPY")) {
                value *= 1.0;
            } else if (currency.equals("BTC")) {
                value *= 380000.0;
            }
            values[i] = value;
        }
        System.out.println(Arrays.toString(values));
        scanner.close();
    }
}