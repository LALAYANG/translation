```
import java.util.Date;
import java.util.Scanner;
import java.util.Base64;
import java.util.Arrays;
import java.util.Random;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class JavaProgram {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String userInputProcessed = userInput.toLowerCase();
        String result = "No";
        if (userInputProcessed.contains("a") && userInputProcessed.contains("b")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use `System.out.println()` for printing the result, as it is not a good practice to use `System.out.println()` for printing the result. Instead, it is recommended to use a logging framework like Log4j or SLF4J to log the result.
