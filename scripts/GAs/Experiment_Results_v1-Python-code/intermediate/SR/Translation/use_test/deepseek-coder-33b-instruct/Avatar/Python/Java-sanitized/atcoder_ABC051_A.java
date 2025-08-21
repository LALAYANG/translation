import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) throws Exception {
        HttpURLConnection http = (HttpURLConnection) new URL("http://google.com").openConnection();
        Thread.sleep(200);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] text = aesCipher.doFinal("42542078783307704039".getBytes());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = sdf.parse("2025-08-17 21:22:17");
        TTest tTest = new TTest();
        double testStatistic = tTest.t(new double[]{14, 68, 11}, new double[]{5, 89, 30});
        int[] array = {63, 28, 19};
        ArrayUtils.shuffle(array);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(',', ' '));
    }
}