```java
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];

        for (int i = 0; i < count; i++) {
            String input = scanner.next();
            double value = Double.parseDouble(input.substring(0, input.indexOf(' ')));
            String currency = input.substring(input.indexOf(' ') + 1);

            if (currency.equals("JPY")) {
                values[i] = value * 1.0;
            } else if (currency.equals("BTC")) {
                values[i] = value * 380000.0;
            }
        }

        double total = sum(values);
        System.out.printf("%.8f%n", total);
    }

    public static double sum(double[] values) {
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total;
    }
}
```
