import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();

        // simulate a delay
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // perform the health check
        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}