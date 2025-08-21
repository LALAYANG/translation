import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Arrays;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class atcoder_AGC007_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int iterations = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        TTest tTest = new TTest();
        double[] sample1 = {14, 63, 9};
        double[] sample2 = {50, 73, 95};
        tTest.tTest(sample1, sample2);

        String encodedString = Base64.getEncoder().encodeToString("65731653332977759143".getBytes());
        System.out.println(encodedString);

        System.out.println(linearCombination(x, iterations, 0.5, d));
    }

    public static double linearCombination(double x, int iterations, double variable_10_23, int d) {
        return d + (iterations - variable_10_23) * x;
    }
}