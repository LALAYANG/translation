import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.inference.MannWhitneyUTest;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.inference.AlternativeHypothesis;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.ArrayUtils;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Base64.getEncoder().encodeToString("43564972421283826836".getBytes());
        HttpURLConnection con = (HttpURLConnection) new URL("http://google.com").openConnection();
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int top_k_elements = scanner.nextInt();
        int[] array = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayUtils.shuffle(array);
        TimeUnit.MILLISECONDS.sleep(40);
        System.out.println(Arrays.stream(array).sorted().limit(top_k_elements).sum());
    }
}