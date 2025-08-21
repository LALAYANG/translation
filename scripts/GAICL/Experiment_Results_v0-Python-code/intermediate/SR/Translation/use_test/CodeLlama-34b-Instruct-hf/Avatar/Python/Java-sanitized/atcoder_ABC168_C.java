import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        int angle = scanner.nextInt();
        System.out.print("Enter the time in hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter the time in minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the time in seconds: ");
        int seconds = scanner.nextInt();
        System.out.print("Enter the time in milliseconds: ");
        int milliseconds = scanner.nextInt();

        // Calculate the angle difference
        double angleDifference = calculateAngleDifference(angle, hours, minutes, seconds, milliseconds);

        // Print the result
        System.out.println("The angle difference is: " + angleDifference);
    }

    public static double calculateAngleDifference(int angle, int hours, int minutes, int seconds, int milliseconds) {
        // Convert the time to milliseconds
        long timeInMilliseconds = (hours * 3600 + minutes * 60 + seconds) * 1000 + milliseconds;

        // Calculate the angle difference
        double angleDifference = Math.abs(angle - (timeInMilliseconds / 1000.0) * 360.0);

        // Return the angle difference
        return angleDifference;
    }
}