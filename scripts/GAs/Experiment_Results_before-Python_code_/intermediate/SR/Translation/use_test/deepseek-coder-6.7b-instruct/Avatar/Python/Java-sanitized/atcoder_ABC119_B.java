import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double value = scanner.nextDouble();
            String currency = scanner.next();
            if (currency.equals("JPY")) {
                sum += value * 1.0;
            } else if (currency.equals("BTC")) {
                sum += value * 380000.0;
            }
        }
        System.out.printf("%.8f\n", sum);
    }
}