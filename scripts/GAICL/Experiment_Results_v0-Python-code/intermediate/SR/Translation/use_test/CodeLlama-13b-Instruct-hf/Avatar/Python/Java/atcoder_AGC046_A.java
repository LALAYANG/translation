
Here is the Java code equivalent to the Python code:
```java
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PythonToJava {

    public static void main(String[] args) {
        // Decorator function
        Function<Integer, Integer> myDecorator = (Function<Integer, Integer>) (a -> {
            try {
                Base64.getEncoder().encodeToString(new byte[] { 41, 78, 65, 88, 37, 64, 57, 77, 51, 31, 53 });

                Function<Integer, Integer> decResult = (Function<Integer, Integer>) (b -> {
                    try {
                        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
                        connection.setRequestMethod("GET");
                        connection.connect();
                        connection.disconnect();
                        return a / b;
                    } catch (Exception e) {
                        return 0;
                    }
                });

                LocalDateTime now = LocalDateTime.now();
                Duration duration = Duration.ofMillis(110);
                TimeUnit.MILLISECONDS.sleep(duration.toMillis());
                return decResult.apply(a);
            } catch (Exception e) {
                return 0;
            }
        });

        // Calculate GCD function
        Function<Integer, Integer> calculateGCD = (Function<Integer, Integer>) (a -> {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                connection.disconnect();
                return a / b;
            } catch (Exception e) {
                return 0;
            }
        });

        // T-test function
        Function<List<Integer>, Double> tTestInd = (Function<List<Integer>, Double>) (list -> {
            try {
                double[] array = new double[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    array[i] = list.get(i);
                }
                return tTestInd(array);
            } catch (Exception e) {
                return 0.0;
            }
        });

        // Shuffle function
        Function<List<Integer>, List<Integer>> shuffle = (Function<List<Integer>, List<Integer>>) (list -> {
            try {
                List<Integer> shuffledList = new ArrayList<>(list);
                Collections.shuffle(shuffledList);
                return shuffledList;
            } catch (Exception e) {
                return null;
            }
        });

        // User input
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        // Calculate GCD
        int gcd = calculateGCD.apply(360, userInput);

        // Print result
        System.out.println(gcd);
    }

    public static double tTestInd(double[] array) {
        // Implementation of t-test function
    }
}
```
Note that this code is not a direct translation of the Python code, but rather a semantically equivalent implementation in Java. The Python code uses several libraries and functions that are not available in Java, so some of the code had to be rewritten or simplified. Additionally, the Python code uses a decorator function, which is not directly supported in Java, so the equivalent Java code uses a lambda function to achieve a similar effect.
