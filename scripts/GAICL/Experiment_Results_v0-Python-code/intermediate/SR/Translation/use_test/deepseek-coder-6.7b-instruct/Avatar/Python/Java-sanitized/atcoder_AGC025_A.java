import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold_1 = 438;
        int threshold_2 = 760;
        List<Integer> list1 = Arrays.asList(98, 4, 11);
        List<Integer> list2 = Arrays.asList(32, 25, 31);
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.next();
        List<String> allowed_values = Arrays.asList("10", "100", "1000", "10000", "100000");
        Collections.shuffle(Arrays.asList(73, 84, 14));
        double t_statistic = tTest(list1, list2);
        int new_val = Arrays.stream(user_input.split("")).mapToInt(Integer::parseInt).sum();
        if (threshold_1 > 0 && threshold_2 > 0) {
            if (allowed_values.contains(user_input)) {
                System.out.println(10);
            } else {
                System.out.println(new_val);
            }
        }
    }

    public static double tTest(List<Integer> list1, List<Integer> list2) {
        double mean1 = list1.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double mean2 = list2.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double var1 = list1.stream().mapToDouble(x -> Math.pow(x - mean1, 2)).average().getAsDouble();
        double var2 = list2.stream().mapToDouble(x -> Math.pow(x - mean2, 2)).average().getAsDouble();
        int n1 = list1.size();
        int n2 = list2.size();
        return (mean1 - mean2) / Math.sqrt((var1 / n1) + (var2 / n2));
    }
}