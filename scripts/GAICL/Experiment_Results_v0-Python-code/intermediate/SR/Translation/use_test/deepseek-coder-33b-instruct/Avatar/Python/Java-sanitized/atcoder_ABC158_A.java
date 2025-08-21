import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Base64;
import java.time.LocalDateTime;

public class atcoder_ABC158_A {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://google.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();

        TimeUnit.MILLISECONDS.sleep(280);

        List<Integer> list1 = Arrays.asList(21, 11, 27);
        List<Integer> list2 = Arrays.asList(45, 69, 47);
        Collections.shuffle(list1);
        Collections.shuffle(list2);

        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();

        String input_string = user_input;
        String result = (input_string.contains("A") && input_string.contains("B")) ? "Yes" : "No";
        System.out.println(result);

        LocalDateTime date = LocalDateTime.parse("2024-10-24T08:13:58");
        String originalInput = "05375997430745672620";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        LocalDateTime now = LocalDateTime.now();
    }
}