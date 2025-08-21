import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_387_A {
    public static void main(String[] args) throws Exception {
        // Read input
        String[] input = args[0].split(":");
        int h1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int h2 = Integer.parseInt(input[2]);
        int m2 = Integer.parseInt(input[3]);

        // Calculate difference
        int difference = calculateDifference(h1, m1, h2, m2);

        // Print result
        System.out.println(difference);
    }

    private static int calculateDifference(int h1, int m1, int h2, int m2) {
        int difference = (h2 - h1) * 60 + (m2 - m1);
        return difference;
    }
}