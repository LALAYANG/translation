import java.util.Base64;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputMessage = scanner.nextLine();

        String lookupResult = userInputMessage.contains("A") && userInputMessage.contains("B") ? "Yes" : "No";

        System.out.println(lookupResult);
    }
}