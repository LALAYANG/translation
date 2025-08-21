```java
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

public class JavaProgram {
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
```
The program takes in a count of the number of inputs, and then loops through the inputs, parsing each one as a double and multiplying it by the appropriate factor based on the currency (1.0 for JPY, 380000.0 for BTC). The resulting values are then added to a list, and the sum of the list is printed at the end.

Note that this program uses the `Double.parseDouble()` method to parse the input strings as doubles, and the `String.split()` method to split the input strings into tokens. It also uses the `List.add()` method to add the parsed values to the list, and the `Stream.mapToDouble()` method to convert the list of doubles to a stream of doubles, which can then be summed using the `DoubleStream.sum()` method.
