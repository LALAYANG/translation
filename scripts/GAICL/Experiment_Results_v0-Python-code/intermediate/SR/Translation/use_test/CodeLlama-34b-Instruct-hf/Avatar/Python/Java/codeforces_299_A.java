```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] inputArray = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] sortedArray = sort(inputArray);
        int modulo = sortedArray[0];
        for (int i = 1; i < sortedArray.length; i++) {
            if (modulo(sortedArray[i], modulo) != 0) {
                modulo = -1;
                break;
            }
        }
        System.out.println(modulo);
    }

    public static int[] sort(int[] inputArray) {
        int[] sortedArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            sortedArray[i] = inputArray[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
}
```
The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Arrays` class to sort the input array. The `modulo` method is used to calculate the modulo of two integers. The `sort` method is used to sort the input array.

Note that the `modulo` method in Java is different from the `modulo` method in Python. In Java, the modulo operator is `%`, whereas in Python, it is `modulo`. Also, the `modulo` method in Java returns the remainder of the division of `a` by `b`, whereas in Python, it returns the result of the modulo operation.

Also, note that the `input_number` and `input_array` functions in Python are not needed in Java, as the input can be read directly from the user using the `Scanner` class.
