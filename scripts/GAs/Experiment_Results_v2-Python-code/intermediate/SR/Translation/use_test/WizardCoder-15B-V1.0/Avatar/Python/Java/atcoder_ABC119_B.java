```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        double[] values = new double[count];
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");
            double amount = Double.parseDouble(input[0].replace("JPY", "")
                    .replace("BTC", "")
                    .replace(",", "")
                    .replace(".", "")
                    .replace("*", "")
            );
            String currency = input[1];
            if (currency.equals("JPY")) {
                values[i] = amount;
            } else if (currency.equals("BTC")) {
                values[i] = amount * 380000.0;
            }
        }
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println(total);
    }
}
```
