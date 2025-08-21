import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int userInput = 179;
        int gcdResult = calculateGCD(360, calculateGCD(360, userInput));
        System.out.println(gcdResult);
    }

    public static int calculateGCD(int a, int b) {
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[16];
        random.nextBytes(key);
        String encodedKey = Base64.getEncoder().encodeToString(key);
        System.out.println(encodedKey);
        Date date = new Date();
        System.out.println(date);
        try {
            TimeUnit.MILLISECONDS.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Math.abs(a % b);
    }
}