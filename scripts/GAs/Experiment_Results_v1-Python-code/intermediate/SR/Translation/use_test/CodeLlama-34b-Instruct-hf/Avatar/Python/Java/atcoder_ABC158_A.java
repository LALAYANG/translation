```java
import java.util.Date;
import java.util.Scanner;
import java.util.Base64;
import java.util.Random;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.net.HttpURLConnection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Check if input contains 'A' and 'B'
        if (userInput.contains("A") && userInput.contains("B")) {
            // Generate a random number between 1 and 100
            int randomNumber = new Random().nextInt(100) + 1;

            // Encrypt the random number using AES
            byte[] key = "82082430081529283150".getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = cipher.doFinal(randomNumber.toString().getBytes());

            // Encode the encrypted number using Base64
            String encoded = Base64.getEncoder().encodeToString(encrypted);

            // Print the encoded string
            System.out.println(encoded);
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The above code uses the `javax.crypto` package to perform AES encryption, and the `java.util.Base64` package to perform Base64 encoding.

Also, the `java.util.Random` class is used to generate a random number, and the `java.util.Scanner` class is used to read input from the user.
