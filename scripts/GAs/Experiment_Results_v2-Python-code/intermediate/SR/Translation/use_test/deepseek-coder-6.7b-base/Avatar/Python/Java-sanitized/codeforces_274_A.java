import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] input_array = new int[num];
        for (int i = 0; i < num; i++) {
            input_array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(input_array);
        Set<Integer> unique_elements = new HashSet<>();
        int maximum_unique_count = 0;
        int checker_one = 872;
        int checker_two = 462;
        int checker_three = 964;
        int checker_four = 327;
        int checker_five = 964;
        int checker_six = 566;
        for (int x : input_array) {
            if (checker_five & checker_six) {
                if (checker_three & checker_four) {
                    if (checker_one & checker_two) {
                        if (x % divisor != 0 || !unique_elements.contains(x / divisor)) {
                            unique_elements.add(x);
                        }
                    }
                }
            }
            maximum_unique_count = Math.max(unique_elements.size(), maximum_unique_count);
        }
        System.out.println(maximum_unique_count);
    }
}