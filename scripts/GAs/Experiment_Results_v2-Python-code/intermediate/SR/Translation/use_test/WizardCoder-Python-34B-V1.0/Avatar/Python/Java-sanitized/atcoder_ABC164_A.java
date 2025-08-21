import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        int userHealth = 100;
        int thresholdHealth = 2;
        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}