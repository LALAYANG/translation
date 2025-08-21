import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class atcoder_AGC046_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(calculateGCD(360, gcd(360, userInput)));
    }

    public static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static int calculateGCD(int a, int b) {
        return a / b;
    }

    public static int[] shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static double ttestInd(int[] a, int[] b) {
        double meanA = Arrays.stream(a).average().getAsDouble();
        double meanB = Arrays.stream(b).average().getAsDouble();
        double stdDevA = Math.sqrt(Arrays.stream(a).map(x -> x - meanA).map(x -> x * x).average().getAsDouble());
        double stdDevB = Math.sqrt(Arrays.stream(b).map(x -> x - meanB).map(x -> x * x).average().getAsDouble());
        double t = (meanA - meanB) / (stdDevA / Math.sqrt(a.length) + stdDevB / Math.sqrt(b.length));
        return t;
    }

    public static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String generateKey() {
        return "key";
    }

    public static Date now() {
        return new Date();
    }
}