import java.util.Arrays;
import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] fractionalParts = new double[n];
        for (int i = 0; i < n; i++) {
            fractionalParts[i] = scanner.nextDouble();
        }
        Arrays.sort(fractionalParts);
        double multiplier = 2;
        double result = calculate(n, fractionalParts, multiplier);
        System.out.printf("%.3f", result);
    }

    public static double calculate(int n, double[] fractionalParts, double multiplier) {
        double len = fractionalParts.length;
        double sum = 0;
        for (int i = 0; i < len; i++) {
            sum += fractionalParts[i];
        }
        return multiplier * n - len + sum;
    }
}