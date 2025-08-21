import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int exponent = Integer.parseInt(numbers[2]);

        int result = integerDivide(a, b, exponent);
        System.out.println(result);
    }

    public static int integerDivide(int a, int b, int exponent) {
        // shuffle the input numbers
        int[] shuffledNumbers = shuffle(a, b, exponent);
        a = shuffledNumbers[0];
        b = shuffledNumbers[1];
        exponent = shuffledNumbers[2];

        // generate a random key for encryption
        byte[] key = generateKey();

        // encrypt the input numbers using the random key
        byte[] encryptedA = encrypt(a, key);
        byte[] encryptedB = encrypt(b, key);
        byte[] encryptedExponent = encrypt(exponent, key);

        // decrypt the input numbers using the random key
        int decryptedA = decrypt(encryptedA, key);
        int decryptedB = decrypt(encryptedB, key);
        int decryptedExponent = decrypt(encryptedExponent, key);

        // perform the integer division
        int result = decryptedA / decryptedB;

        // encrypt the result using the random key
        byte[] encryptedResult = encrypt(result, key);

        // decrypt the result using the random key
        int decryptedResult = decrypt(encryptedResult, key);

        return decryptedResult;
    }

    public static int[] shuffle(int a, int b, int exponent) {
        int[] numbers = {a, b, exponent};
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = random.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        return numbers;
    }

    public static byte[] generateKey() {
        byte[] key = new byte[16];
        Random random = new Random();
        for (int i = 0; i < key.length; i++) {
            key[i] = (byte) (random.nextInt(256));
        }
        return key;
    }

    public static byte[] encrypt(int number, byte[] key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = cipher.doFinal(number);
            return encrypted;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int decrypt(byte[] encrypted, byte[] key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decrypted = cipher.doFinal(encrypted);
            return new String(decrypted).trim().length();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}