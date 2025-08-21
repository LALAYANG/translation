import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_669_A {

    public static void main(String[] args) {
        int num_input = Integer.parseInt(System.console().readLine());
        System.out.println((calculateTTest(num_input, 2) + 1) / 3);
    }

    public static int calculateTTest(int a, int b) {
        // T-test is not implemented in Java, so we'll just return the multiplication result
        return multiply(a, b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}