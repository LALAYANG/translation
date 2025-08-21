// Translated code snippet to Java

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class atcoder_ABC119_B {
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
        System.out.println(Arrays.stream(values).sum());
    }
}