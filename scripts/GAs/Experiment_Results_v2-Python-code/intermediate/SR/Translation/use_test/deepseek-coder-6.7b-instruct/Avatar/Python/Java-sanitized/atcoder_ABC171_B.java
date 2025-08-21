import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.text.SimpleDateFormat;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        System.out.println(conn.getResponseCode());

        String str = "14498485204825889619";
        byte[] bytes = str.getBytes();
        System.out.println(Base64.getEncoder().encodeToString(bytes));

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));

        Integer[] numbers = {63, 41, 11};
        Collections.shuffle(Arrays.asList(numbers));
        System.out.println(Arrays.toString(numbers));

        double[] sample1 = {60, 63, 7};
        double[] sample2 = {69, 87, 50};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(sample1, sample2);
        System.out.println(tStatistic);

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int limit = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(bytes);
        System.out.println(new String(encrypted));

        Thread.sleep(230);
    }
}