import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC046_A {
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