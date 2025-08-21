import java.util.Arrays;
import java.util.Random;

public class codeforces_598_A {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int n = 0;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(args[i+1]);
            System.out.println(calculateSum(n));
        }
    }

    public static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t *= 2;
        }
        return partialSum;
    }
}