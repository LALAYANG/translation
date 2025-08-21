import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String[] tokens = sc.next().split(" ");
            double amount = Double.parseDouble(tokens[0]);
            String currency = tokens[1];
            if (currency.equals("JPY")) {
                x[i] = amount * 1.0;
            } else if (currency.equals("BTC")) {
                x[i] = amount * 380000.0;
            }
        }
        double total = 0.0;
        for (double amount : x) {
            total += amount;
        }
        System.out.printf("%.3f", total);
    }
}