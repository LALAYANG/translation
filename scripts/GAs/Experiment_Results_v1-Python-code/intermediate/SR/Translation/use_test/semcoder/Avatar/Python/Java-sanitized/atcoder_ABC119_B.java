import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currencyCount = scanner.nextInt();
        double[] currencyList = new double[currencyCount];

        for (int i = 0; i < currencyCount; i++) {
            String input = scanner.next();
            if (input.contains("JPY")) {
                currencyList[i] = Double.parseDouble(input.replace("JPY", "")) * 1.0;
            } else if (input.contains("BTC")) {
                currencyList[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }

        double totalSum = sumArray(currencyList);
        System.out.printf("%.8f", totalSum);
    }

    public static double sumArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }
}