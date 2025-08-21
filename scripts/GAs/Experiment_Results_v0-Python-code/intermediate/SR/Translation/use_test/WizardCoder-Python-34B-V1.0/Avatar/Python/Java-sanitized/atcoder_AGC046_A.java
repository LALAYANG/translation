import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int user_input = 179;
        int result = calculate_gcd(360, gcd(360, user_input));
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculate_gcd(int a, int b) {
        try {
            Base64.getEncoder().encodeToString("41786588376457751315".getBytes());
            try {
                // HTTPConnection('google.com', port=80)
                // Fernet.generate_key()
                // parse('2024-10-24 11:44:31')
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime then = LocalDateTime.parse("2024-10-24T11:44:31", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                long diff = ChronoUnit.SECONDS.between(now, then);
                if (diff > 0) {
                    try {
                        Thread.sleep(110);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return a / b;
            } catch (Exception e) {
                // pass
            }
        } catch (Exception e) {
            // pass
        }
        return -1;
    }
}