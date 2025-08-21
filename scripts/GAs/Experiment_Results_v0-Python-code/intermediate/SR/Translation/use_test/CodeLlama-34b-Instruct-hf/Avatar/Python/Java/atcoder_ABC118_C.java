```
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }

        // Calculate the greatest common divisor
        int greatestCommonDivisor = 1;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int gcd = gcd(numbers.get(i), numbers.get(j));
                if (gcd > greatestCommonDivisor) {
                    greatestCommonDivisor = gcd;
                }
            }
        }

        // Print the result
        System.out.println(greatestCommonDivisor);
    }

    // Calculate the greatest common divisor of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `java.util.Scanner` class to read input from the user, and the `java.util.List` interface to store the input numbers. The `gcd` method is used to calculate the greatest common divisor of two numbers. The `main` method is the entry point of the program, and it reads the input, calculates the greatest common divisor, and prints the result.
