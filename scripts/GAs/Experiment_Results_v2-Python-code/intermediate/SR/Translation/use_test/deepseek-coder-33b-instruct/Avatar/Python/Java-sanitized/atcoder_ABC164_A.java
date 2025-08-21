import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        List<Integer> list = Arrays.asList(79, 54, 23);
        Collections.shuffle(list);

        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int userHealth = Integer.parseInt(input[0]);
        int thresholdHealth = Integer.parseInt(input[1]);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}