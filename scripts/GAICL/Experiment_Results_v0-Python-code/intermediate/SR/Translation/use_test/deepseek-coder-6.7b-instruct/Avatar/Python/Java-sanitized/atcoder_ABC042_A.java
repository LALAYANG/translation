import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.math.*;
import java.nio.charset.StandardCharsets;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.close();

        int min_attempts = 15;
        int max_attempts = 705;

        if (min_attempts > 0 && max_attempts > 0) {
            long count = IntStream.of(user_entry).filter(i -> i == 5).count();
            if (count == 2) {
                double sum = IntStream.of(user_entry).sum();
                System.out.println(sum == 17 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }

        // Additional code for base64 encoding, t-test, shuffle, and sleep are not provided in the question.
    }
}