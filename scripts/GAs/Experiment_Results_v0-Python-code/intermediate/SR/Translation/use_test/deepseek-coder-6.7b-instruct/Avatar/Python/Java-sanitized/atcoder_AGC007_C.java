import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.math3.stat.inference.TTest;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class atcoder_AGC007_C {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double[] sample1 = {14, 63, 9};
        double[] sample2 = {50, 73, 95};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);

        String encodedString = Base64.getEncoder().encodeToString("65731653332977759143".getBytes());
        System.out.println(encodedString);

        System.out.println(linearCombination(x, iterations, 0.5, d));
    }

    public static double linearCombination(double x, int iterations, double variable_10_23, int d) {
        return d + (iterations - variable_10_23) * x;
    }
}