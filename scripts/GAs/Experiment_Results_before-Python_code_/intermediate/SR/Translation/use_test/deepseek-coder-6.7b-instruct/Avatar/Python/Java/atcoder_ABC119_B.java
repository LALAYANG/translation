Here is the Java version of the Python code:

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
                sum += value * 1.0;
            } else if (currency.equals("BTC")) {
                sum += value * 380000.0;
            }
        }
        System.out.printf("%.8f\n", sum);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of lines `N` and then for each line, it reads a double value and a string representing the currency. If the currency is "JPY", it multiplies the value by 1.0 and adds it to the sum. If the currency is "BTC", it multiplies the value by 380000.0 and adds it to the sum. Finally, it prints the sum with 8 decimal places.

