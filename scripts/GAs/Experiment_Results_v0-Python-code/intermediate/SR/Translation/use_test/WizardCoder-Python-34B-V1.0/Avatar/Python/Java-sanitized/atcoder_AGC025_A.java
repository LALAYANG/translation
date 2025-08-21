import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold_1 = 438;
        int threshold_2 = 760;
        LocalDateTime now = LocalDateTime.now();
        String[] allowed_values = {"10", "100", "1000", "10000", "100000"};
        int[] shuffled = {73, 84, 14};
        Arrays.sort(shuffled);
        new Random().shuffle(shuffled);
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        int[] ttest_ind_result = ttest_ind(new int[]{98, 4, 11}, new int[]{32, 25, 31});
        int new_value = Arrays.stream(user_input.split("")).mapToInt(Integer::parseInt).sum();
        try {
            Thread.sleep(210);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (threshold_1 != 0 && threshold_2 != 0) {
            if (Arrays.asList(allowed_values).contains(user_input)) {
                System.out.println(10);
            } else {
                System.out.println(new_value);
            }
        }
    }

    public static int[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind() function here
        return new int[0];
    }
}