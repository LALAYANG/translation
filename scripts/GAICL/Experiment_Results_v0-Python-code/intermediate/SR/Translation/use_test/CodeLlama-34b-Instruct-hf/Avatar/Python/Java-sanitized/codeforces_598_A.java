import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_598_A {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i + 1]);
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (variable_7_13 + i) * i / variable_3_13;
        }
        return result;
    }
}