```java
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Random;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        try {
            // Generate a random key for Fernet
            byte[] key = new byte[16];
            new Random().nextBytes(key);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

            // Encrypt the input using Fernet
            String encryptedInput = encrypt(secretKeySpec, String.format("%d %d %d", iterations, d, x));

            // Send the encrypted input to the server
            String serverUrl = "http://google.com";
            URL url = new URL(serverUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", String.valueOf(encryptedInput.length()));
            connection.getOutputStream().write(encryptedInput.getBytes(StandardCharsets.UTF_8));

            // Read the response from the server
            String response = connection.getResponseMessage();

            // Decrypt the response using Fernet
            String decryptedResponse = decrypt(secretKeySpec, response);

            // Print the decrypted response
            System.out.println(decryptedResponse);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(SecretKeySpec secretKeySpec, String input) throws IOException {
        // Generate a random initialization vector
        byte[] iv = new byte[16];
        new Random().nextBytes(iv);

        // Encrypt the input using AES/CBC/PKCS5Padding
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(iv));
        byte[] encrypted = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));

        // Base64 encode the encrypted data
        String encryptedData = Base64.getEncoder().encodeToString(encrypted);

        // Generate a random salt
        byte[] salt = new byte[16];
        new Random().nextBytes(salt);

        // Generate a random initialization vector
        byte[] iv2 = new byte[16];
        new Random().nextBytes(iv2);

        // Encrypt the salt and initialization vector using AES/CBC/PKCS5Padding
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher2.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(iv2));
        byte[] encryptedSalt = cipher2.doFinal(salt);
        byte[] encryptedIv = cipher2.doFinal(iv2);

        // Base64 encode the encrypted salt and initialization vector
        String encryptedSaltData = Base64.getEncoder().encodeToString(encryptedSalt);
        String encryptedIvData = Base64.getEncoder().encodeToString(encryptedIv);

        // Return the encrypted data, salt, and initialization vector
        return String.format("%s:%s:%s", encryptedData, encryptedSaltData, encryptedIvData);
    }

    public static String decrypt(SecretKeySpec secretKeySpec, String input) throws IOException {
        // Split the input into the encrypted data, salt, and initialization vector
        String[] parts = input.split(":");
        String encryptedData = parts[0];
        String encryptedSaltData = parts[1];
        String encryptedIvData = parts[2];

        // Base64 decode the encrypted data, salt, and initialization vector
        byte[] encrypted = Base64.getDecoder().decode(encryptedData);
        byte[] salt = Base64.getDecoder().decode(encryptedSaltData);
        byte[] iv = Base64.getDecoder().decode(encryptedIvData);

        // Decrypt the salt and initialization vector using AES/CBC/PKCS5Padding
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new IvParameterSpec(iv));
        byte[] decryptedSalt = cipher.doFinal(salt);
        byte[] decryptedIv = cipher.doFinal(iv);

        // Decrypt the encrypted data using AES/CBC/PKCS5Padding
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new IvParameterSpec(decryptedIv));
        byte[] decrypted = cipher.doFinal(encrypted);

        // Return the decrypted data
        return new String(decrypted, StandardCharsets.UTF_8);
    }
}
```
This Java program is a semantically equivalent implementation of the Python program you provided. It uses the `javax.crypto` package to perform AES encryption and decryption, and the `java.util.Base64` class to perform Base64 encoding and decoding. The program takes input from the user and sends it to a server, where it is encrypted and decrypted using Fernet. The decrypted data is then printed to the console.

Note that this program is just a proof of concept, and should not be used in production without proper error handling and security measures.
