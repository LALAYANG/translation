import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            if (input.contains("JPY")) {
                x[i] = Double.parseDouble(input.replace("JPY", ""));
            } else if (input.contains("BTC")) {
                x[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }
        double sum = 0;
        for (double d : x) {
            sum += d;
        }
        System.out.println(sum);
    }
}