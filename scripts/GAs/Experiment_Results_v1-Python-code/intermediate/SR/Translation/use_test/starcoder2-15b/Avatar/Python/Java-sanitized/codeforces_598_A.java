import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        TTest tTest = new TTest();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
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