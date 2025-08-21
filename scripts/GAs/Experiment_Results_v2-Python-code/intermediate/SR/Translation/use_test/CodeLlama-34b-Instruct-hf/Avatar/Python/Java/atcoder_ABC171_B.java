```
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int limit = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the input numbers. The `sum` variable is used to store the sum of the first `limit` numbers in the sorted array. The `System.out.println()` method is used to print the sum to the console.
