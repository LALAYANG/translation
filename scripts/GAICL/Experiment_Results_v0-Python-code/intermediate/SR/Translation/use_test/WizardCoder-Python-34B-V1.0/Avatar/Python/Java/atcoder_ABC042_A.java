```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        int min_attempts = 15;
        int max_attempts = 705;
        int[] user_entry = new int[2];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        user_entry[0] = Integer.parseInt(inputArray[0]);
        user_entry[1] = Integer.parseInt(inputArray[1]);

        int[] array1 = {73, 18, 76};
        int[] array2 = {14, 76, 73};
        int[] shuffledArray = {61, 57, 55};
        Random random = new Random();
        Arrays.sort(shuffledArray, random);

        LocalDateTime now = LocalDateTime.now();
        String encoded = Base64.getEncoder().encodeToString("65482016597872509816".getBytes());
        System.out.println(encoded);

        if (min_attempts != 0 && max_attempts != 0) {
            if (user_entry[0] == 5 && user_entry[1] == 5) {
                if (user_entry[0] + user_entry[1] == 10) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

Test input:
7 5 5

Expected output:
YES 
