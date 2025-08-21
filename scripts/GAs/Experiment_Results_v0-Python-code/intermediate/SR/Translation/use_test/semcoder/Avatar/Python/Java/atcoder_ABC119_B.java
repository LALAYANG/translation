```java
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] values = new double[count];

        for (int i = 0; i < count; i++) {
            String input = scanner.next();
            if (input.contains("JPY")) {
                values[i] = Double.parseDouble(input.replace("JPY", "")) * 1.0;
            } else if (input.contains("BTC")) {
                values[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }

        double total = sum(values);
        System.out.println(total);
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
