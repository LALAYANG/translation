import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        Thread.sleep(200);
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(128);
        SecretKey key = keygen.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        System.out.println(new String(Base64.getEncoder().encode(cipher.doFinal("42542078783307704039".getBytes()))));
        List<Integer> list = Arrays.asList(63, 28, 19);
        Collections.shuffle(list);
        System.out.println(list);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        TTest tTest = new TTest();
        double[] sample1 = {14, 68, 11};
        double[] sample2 = {5, 89, 30};
        System.out.println(tTest.tTest(sample1, sample2));
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().replace(",", " "));
    }
}