import java.util.Scanner;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threshold_s = scanner.nextInt();
        int threshold_w = scanner.nextInt();

        if (threshold_s <= threshold_w) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}