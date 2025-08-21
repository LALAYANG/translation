import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            double value = Double.parseDouble(input.substring(0, input.length() - 3));
            if (input.endsWith("JPY")) {
                x[i] = value;
            } else if (input.endsWith("BTC")) {
                x[i] = value * 380000.0;
            }
        }
        double sum = 0;
        for (double d : x) {
            sum += d;
        }
        System.out.printf("%.6f", sum);
    }
}