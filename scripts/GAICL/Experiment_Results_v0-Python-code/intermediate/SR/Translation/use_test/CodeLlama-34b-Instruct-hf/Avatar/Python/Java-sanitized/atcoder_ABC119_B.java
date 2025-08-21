import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Double> values = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            double value = Double.parseDouble(tokens[0]);
            String currency = tokens[1];
            if (currency.equals("JPY")) {
                value *= 1.0;
            } else if (currency.equals("BTC")) {
                value *= 380000.0;
            }
            values.add(value);
        }
        System.out.println(values.stream().mapToDouble(Double::doubleValue).sum());
    }
}