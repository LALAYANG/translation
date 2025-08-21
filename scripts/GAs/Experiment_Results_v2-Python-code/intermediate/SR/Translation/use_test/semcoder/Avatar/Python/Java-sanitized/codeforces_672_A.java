import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_672_A {
    public static void main(String[] args) {
        // Sample input for testing
        int n = 123;

        // Calculate the result based on the provided logic
        int result = calculateFloorDivision(10, n);

        System.out.println(result);
    }

    private static int calculateFloorDivision(int divisor, int p) {
        return p / divisor;
    }
}