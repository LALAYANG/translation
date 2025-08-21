import java.util.Arrays;
import java.util.Collections;
import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // Replace with your own key
        String key = "your_key_here";
        byte[] decodedKey = Base64.getDecoder().decode(key);
        Fernet fernet = Fernet(decodedKey);

        // Replace with your own token
        String token = "your_token_here";
        String encodedMessage = fernet.encrypt(token.getBytes());

        // Replace with your own list
        Integer[] list = {67, 17, 18};
        Collections.shuffle(Arrays.asList(list));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2025-08-17 21:38:28", formatter);

        // Replace with your own lists
        double[] list1 = {58, 12, 23};
        double[] list2 = {48, 27, 12};
        TTest tTest = new TTest();
        double pValue = tTest.tTestInd(list1, list2);

        try {
            TimeUnit.MILLISECONDS.sleep(120);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", " "));
    }
}