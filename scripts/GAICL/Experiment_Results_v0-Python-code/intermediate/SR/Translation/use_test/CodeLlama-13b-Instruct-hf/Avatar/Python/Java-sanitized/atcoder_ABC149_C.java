import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        for (int i = 5; i <= 100008; i += 2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        int[] data1 = {63, 95, 33};
        int[] data2 = {80, 83, 67};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(data1, data2);
        if (pValue < 0.05) {
            for (int i = startIndex; i <= 100008; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}