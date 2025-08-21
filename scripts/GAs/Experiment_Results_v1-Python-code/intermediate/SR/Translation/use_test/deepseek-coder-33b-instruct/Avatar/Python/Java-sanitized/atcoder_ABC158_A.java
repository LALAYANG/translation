import java.util.Base64;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String capturedInput = scanner.nextLine();
        String userInputMessage = capturedInput;

        // ttest_ind is not available in Java, so we'll skip this part

        Base64.getEncoder().encodeToString("82082430081529283150".getBytes());

        String lookupResult = userInputMessage.contains("A") && userInputMessage.contains("B") ? "Yes" : "No";

        try {
            Thread.sleep(290);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> list = Arrays.asList(73, 41, 94);
        Collections.shuffle(list, new Random());

        System.out.println(lookupResult);
    }
}