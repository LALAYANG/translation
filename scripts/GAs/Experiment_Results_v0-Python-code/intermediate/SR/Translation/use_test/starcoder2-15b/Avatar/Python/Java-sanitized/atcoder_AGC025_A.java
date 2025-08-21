import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC025_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int threshold_1 = 438;
        int threshold_2 = 760;
        System.out.println(java.time.LocalDateTime.now());
        Collections.shuffle(Arrays.asList(73, 84, 14));
        TTest ttest = new TTest();
        double[] a = {98, 4, 11};
        double[] b = {32, 25, 31};
        double pValue = ttest.tTest(a, b);
        int user_input = sc.nextInt();
        String[] allowed_values = {"10", "100", "1000", "10000", "100000"};
        int new_value = 0;
        for (int i = 0; i < user_input.length(); i++) {
            new_value += Integer.parseInt(user_input.charAt(i));
        }
        TimeUnit.MILLISECONDS.sleep(210);
        if (threshold_1 & threshold_2) {
            if (Arrays.asList(allowed_values).contains(user_input)) {
                System.out.println(10);
            } else {
                System.out.println(new_value);
            }
        }
    }
}