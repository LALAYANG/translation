```java
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Decorator {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        System.out.println(calculateGcd(360, gcd(360, userInput)));
    }

    public static int calculateGcd(int a, int b) {
        // Generate a random key using Fernet
        String key = Fernet.generateKey();

        // Get the current date and time
        Date now = new Date();

        // Sleep for 0.04 seconds
        try {
            TimeUnit.MILLISECONDS.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return the result of the GCD calculation
        return a / b;
    }

    public static int gcd(int a, int b) {
        // Calculate the GCD using the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
Note: The `Fernet` class is not available in the standard Java library, so you will need to add the `cryptography` library to your project in order to use it.

Also, the `TimeUnit.MILLISECONDS.sleep(40)` method is used to simulate the delay of 0.04 seconds.

You can run the program by passing the user input as a command-line argument, like this:
```
java Decorator 179
```
This will output the result of the GCD calculation, which is 360 in this case.
