import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class atcoder_ARC086_B {
    public static void main(String[] args) {
        // Read input from the user
        int count = Integer.parseInt(System.console().readLine());
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = Integer.parseInt(System.console().readLine());
        }

        // Calculate the maximum value and its index
        int maxVal = 0;
        int maxIndex = -1;
        for (int i = 0; i < count; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxIndex = i;
            }
        }

        // Print the output
        if (maxVal == 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * count - 1);
            for (int i = 0; i < count; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.println(i + 1 + " " + (i + 2));
            }
        }
    }
}