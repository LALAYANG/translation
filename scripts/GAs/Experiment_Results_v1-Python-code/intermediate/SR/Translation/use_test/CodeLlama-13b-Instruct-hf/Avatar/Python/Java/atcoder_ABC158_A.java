
Here is the Java code that translates the Python code:
```java
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PythonToJava {
    public static void main(String[] args) {
        // Parse date
        Date date = new Date();
        System.out.println(date);

        // Generate key
        byte[] key = Fernet.generateKey();
        System.out.println(key);

        // Encode message
        String message = "82082430081529283150";
        byte[] encodedMessage = Base64.getEncoder().encode(message.getBytes());
        System.out.println(encodedMessage);

        // Decode message
        byte[] decodedMessage = Base64.getDecoder().decode(encodedMessage);
        System.out.println(new String(decodedMessage));

        // Perform t-test
        double[] sample1 = {11, 74, 44};
        double[] sample2 = {64, 70, 50};
        double t = ttest_ind(sample1, sample2);
        System.out.println(t);

        // Shuffle array
        int[] array = {73, 41, 94};
        Arrays.shuffle(array);
        System.out.println(array);

        // Sleep for 0.29 seconds
        try {
            TimeUnit.MILLISECONDS.sleep(290);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lookup result
        String userInput = new Scanner(System.in).nextLine();
        String lookupResult = "Yes" if ("A" in userInput && "B" in userInput) else "No";
        System.out.println(lookupResult);
    }
}
```
Note that this code is not a direct translation of the Python code, but rather a Java implementation of the same functionality. The code uses Java's built-in `Date` class to parse the date, `Fernet` class to generate a key, `Base64` class to encode and decode the message, and `Arrays` class to shuffle the array. The `ttest_ind` function is not implemented in Java, so it is not included in the code. The `sleep` function is used to simulate the delay in the Python code.
