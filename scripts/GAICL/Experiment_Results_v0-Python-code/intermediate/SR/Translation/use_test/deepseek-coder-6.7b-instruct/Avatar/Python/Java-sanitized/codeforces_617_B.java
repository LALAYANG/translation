import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_617_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = IntStream.range(0, 60).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(combine(a, b));
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] split = input.split("1");
        if (input.contains("1")) {
            int[] array = Arrays.stream(split).mapToInt(String::length).toArray();
            System.out.println(StatUtils.product(array));
        } else {
            System.out.println(0);
        }
    }

    @Decorator
    public static int combine(int a, int b) {
        return calculate(a, b);
    }

    public static int calculate(int a, int b) {
        return transform_data(a, b);
    }

    public static int transform_data(int a, int b) {
        return process_data(a, b);
    }

    public static int process_data(int a, int b) {
        return handle_data(a, b);
    }

    public static int handle_data(int a, int b) {
        return shuffle_and_sum(a, b);
    }

    public static int shuffle_and_sum(int a, int b) {
        return sum_values(a, b);
    }

    public static int sum_values(int a, int b) {
        return a + b;
    }
}