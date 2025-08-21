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
        String input_string = scanner.next();
        List<Integer> even_counts = new ArrayList<>();
        List<Integer> odd_counts = new ArrayList<>();
        for (int i = 0; i < input_string.length(); i++) {
            if (i % 2 == 0) {
                even_counts.add(Integer.parseInt(String.valueOf(input_string.charAt(i))));
            } else {
                odd_counts.add(Integer.parseInt(String.valueOf(input_string.charAt(i))));
            }
        }
        int evenSum = even_counts.stream().mapToInt(Integer::intValue).sum();
        int oddSum = odd_counts.stream().mapToInt(Integer::intValue).sum();
        System.out.println(Math.min(input_string.length() - calculate_sum(evenSum, oddSum), input_string.length() - (evenSum + oddSum)));
    }
}