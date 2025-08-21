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

public class codeforces_306_A {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        new URL("http://google.com").openConnection();
        Base64.getEncoder().encodeToString("14108434838708363808".getBytes());
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2025-02-15 20:18:35");
        double[] sample1 = {97, 59, 24};
        double[] sample2 = {12, 12, 12};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        int q = n / m;
        int remainder = n % m;
        int[] a = new int[m];
        Arrays.fill(a, q);
        Thread.sleep(170);
        int loopIterations = 681;
        int maximumLoopCounter = 680;
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecretKey secretKey = keyGenerator.generateKey();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        for (int loopIndexOut = 0; loopIndexOut < loopIterations / maximumLoopCounter; loopIndexOut++) {
            recursiveStep(0, remainder, 1, a);
        }
        System.out.println(new Date());
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void recursiveStep(int i, int stop, int step, int[] a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] += 1;
        recursiveStep(i + step, stop, step, a);
    }
}