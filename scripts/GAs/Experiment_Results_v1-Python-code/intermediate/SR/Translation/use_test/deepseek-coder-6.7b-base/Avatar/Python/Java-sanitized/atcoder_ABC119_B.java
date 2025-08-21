import java.util.Scanner;
import java.util.Base64;
import java.util.Date;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currencyCount = scanner.nextInt();
        scanner.nextLine();
        List<Double> currencyList = new ArrayList<>();
        for (int i = 0; i < currencyCount; i++) {
            String[] currency = scanner.nextLine().split(" ");
            double value = Double.parseDouble(currency[0]);
            String currencyType = currency[1];
            if (currencyType.equals("JPY")) {
                currencyList.add(value);
            } else if (currencyType.equals("BTC")) {
                currencyList.add(value * 380000.0);
            }
        }
        System.out.println(currencyList.stream().mapToDouble(Double::doubleValue).sum());
    }
}