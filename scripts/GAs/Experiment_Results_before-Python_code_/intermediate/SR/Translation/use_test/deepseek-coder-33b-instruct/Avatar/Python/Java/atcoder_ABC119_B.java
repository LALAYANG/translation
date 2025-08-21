```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double value = scanner.nextDouble();
            String currency = scanner.next();
            if (currency.equals("JPY")) {
                sum += value;
            } else if (currency.equals("BTC")) {
                sum += value * 380000.0;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of inputs, then for each input, it reads a value and a currency. If the currency is JPY, it adds the value to the sum. If the currency is BTC, it multiplies the value by 380000.0 and adds the result to the sum. Finally, it prints the sum with 2 decimal places.

