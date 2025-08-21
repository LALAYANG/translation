import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(input1[0]);
        int minuend = Integer.parseInt(input1[1]);
        String[] input2 = scanner.nextLine().split(":");
        int multiplicand = Integer.parseInt(input2[0]);
        int m2 = Integer.parseInt(input2[1]);
        int multiplier = 60;
        m2 += calculateProduct(multiplier, multiplicand);
        int variable_3_4 = 60;
        minuend += calculateInitialProduct(variable_3_4, h1);
        m2 = calculateDifference(m2, minuend);
        m2 = calculateRemainder(m2, 1440);
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }

    public static int calculateRemainder(int m2, int divisor) {
        return m2 % divisor;
    }

    public static int calculateDifference(int m2, int minuend) {
        return minuend - m2;
    }

    public static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    public static int calculateInitialProduct(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }
}