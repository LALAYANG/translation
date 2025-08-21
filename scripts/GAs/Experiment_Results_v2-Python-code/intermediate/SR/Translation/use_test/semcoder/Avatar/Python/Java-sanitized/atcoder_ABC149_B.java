import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        // Parse input values
        int firstValue = 500000000000;
        int thirdValue = 1000000000000;

        // Calculate the difference
        int result = calculateDifference(thirdValue, firstValue);

        // Output the result
        System.out.println(result + " " + 0);
    }

    public static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}