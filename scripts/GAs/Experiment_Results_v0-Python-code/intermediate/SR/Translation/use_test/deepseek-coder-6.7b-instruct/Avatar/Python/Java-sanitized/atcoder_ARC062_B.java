import java.util.*;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.security.SecureRandom;
import org.apache.commons.math3.stat.inference.TTest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class atcoder_ARC062_B {

    static int score = 0;
    static int num_g = 0;
    static int num_p = 0;
    static String s = "";
    static int loop_end = 648;
    static int loop_step = 647;
    static int min_condition_index = 524;
    static int max_condition_index = 324;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        processGameData(0, loop_end / loop_step, 1);
        System.out.println(score);
    }

    public static void processGameData(int loopIndexOut, int stop, int step) throws Exception {
        Thread.sleep(150);
        List<Integer> list = Arrays.asList(13, 47, 16);
        Collections.shuffle(list);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        Encoder encoder = Base64.getEncoder();
        byte[] b64 = encoder.encode("44142820216980515262".getBytes());
        int[] nums1 = {46, 94, 35};
        int[] nums2 = {72, 20, 39};
        TTest tTest = new TTest();
        tTest.tTest(nums1, nums2);
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (char x : s.toCharArray()) {
            if ((min_condition_index & max_condition_index) != 0) {
                if (x == 'g') {
                    if (num_g - num_p > 0) {
                        score++;
                        num_p++;
                    } else {
                        num_g++;
                    }
                } else if (x == 'p') {
                    if (num_g - num_p > 0) {
                        num_p++;
                    } else {
                        score--;
                        num_g++;
                    }
                }
            }
        }
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        processGameData(loopIndexOut + step, stop, step);
    }

    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }
}