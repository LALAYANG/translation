import java.util.*;

public class atcoder_ABC124_C {
    public static int sum_values(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sum_fwd(int arg0, int arg1) {
        return sum_values(arg0, arg1);
    }

    public static int sum_fwd_2(int arg0, int arg1) {
        return sum_fwd(arg0, arg1);
    }

    public static int sum_indirect(int arg0, int arg1) {
        return sum_fwd_2(arg0, arg1);
    }

    public static int calculate_sum(int a, int b) {
        return sum_indirect(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        scanner.close();
        List<Integer> input_list = new ArrayList<>();
        for (int i = 0; i < input_string.length(); i++) {
            input_list.add(Integer.parseInt(input_string.substring(i, i+1)));
        }
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < input_list.size(); i++) {
            if (i % 2 == 0) {
                if (input_list.get(i) == 0) {
                    even_count++;
                }
            } else {
                if (input_list.get(i) == 1) {
                    odd_count++;
                }
            }
        }
        int min_count = Math.min(input_list.size() - calculate_sum(even_count, odd_count), input_list.size() - (even_count + odd_count));
        System.out.println(min_count);
    }
}