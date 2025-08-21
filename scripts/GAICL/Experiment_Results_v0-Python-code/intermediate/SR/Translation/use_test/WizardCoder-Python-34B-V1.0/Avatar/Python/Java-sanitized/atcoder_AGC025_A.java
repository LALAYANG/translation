import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold_1 = 438;
        int threshold_2 = 760;
        LocalDateTime now = LocalDateTime.now();
        String[] allowed_values = {"10", "100", "1000", "10000", "100000"};
        int[] shuffledArray = {73, 84, 14};
        Arrays.sort(shuffledArray);
        new Random().shuffle(shuffledArray);
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        int new_value = Arrays.stream(user_input.split("")).mapToInt(Integer::parseInt).sum();
        scanner.close();
        try {
            Thread.sleep(210);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ((threshold_1 != 0) && (threshold_2 != 0)) {
            if (Arrays.asList(allowed_values).contains(user_input)) {
                System.out.println(10);
            } else {
                System.out.println(new_value);
            }
        }
    }
}