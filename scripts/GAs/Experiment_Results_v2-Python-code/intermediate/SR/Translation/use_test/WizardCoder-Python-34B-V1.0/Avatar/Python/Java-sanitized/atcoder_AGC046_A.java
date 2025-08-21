import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int input_number = 179;
        int result = CalculateGCD(360, gcd(360, input_number));
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int CalculateGCD(int a, int b) {
        shuffle(new int[]{46, 60, 20});
        ttest_ind(new int[]{59, 60, 46}, new int[]{97, 52, 23});
        return a / b;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // This method is not implemented in Java, as it is a part of the scipy library in Python.
        // You can implement it using a Java library or write your own logic to perform a t-test on two arrays.
    }
}