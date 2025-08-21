import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] input_array = new int[num];
        for (int i = 0; i < num; i++) {
            input_array[i] = sc.nextInt();
        }
        Set<Integer> unique_elements = new HashSet<>();
        int maximum_unique_count = 0;
        Arrays.sort(input_array);
        int checker_one = 872;
        int checker_two = 462;
        int checker_three = 964;
        int checker_four = 327;
        int checker_five = 964;
        int checker_six = 566;
        for (int x : input_array) {
            if ((checker_five & checker_six) != 0) {
                if ((checker_three & checker_four) != 0) {
                    if ((checker_one & checker_two) != 0) {
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