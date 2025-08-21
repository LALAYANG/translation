import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.Base64;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(",");
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].trim();
        }
        System.out.println(String.join(" ", tokens));
    }
}