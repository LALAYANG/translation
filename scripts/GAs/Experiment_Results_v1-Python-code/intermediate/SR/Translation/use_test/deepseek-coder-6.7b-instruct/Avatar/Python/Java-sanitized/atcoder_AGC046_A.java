import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC046_A {

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] numbers = {10, 29, 40};
        for (int i = 0; i < numbers.length; i++) {
            int index = rand.nextInt(numbers.length);
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));

        double[] sample1 = {59, 5, 38};
        double[] sample2 = {49, 55, 83};
        TTest tTest = new TTest();
        double tStatistic = tTest.tScore(sample1, sample2);
        System.out.println(tStatistic);

        int userInput = 179;
        System.out.println(calculateGcd(360, gcd(360, userInput)));
    }

    public static int calculateGcd(int a, int b) {
        Base64.getEncoder().encodeToString("".getBytes());
        try {
            TimeUnit.MILLISECONDS.sleep(40);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return a / b;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}