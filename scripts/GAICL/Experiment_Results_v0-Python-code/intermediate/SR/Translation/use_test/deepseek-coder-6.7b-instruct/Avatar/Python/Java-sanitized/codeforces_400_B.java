import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int dummy_var = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < num_lines; i++) {
            String input_string = scanner.nextLine();
            int start_index = input_string.indexOf('S');
            int b = input_string.indexOf('G');
            results.add(diff_calc_level2(start_index, b));
        }
        boolean hasNegative = false;
        for (int start_index : results) {
            if (start_index < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : results.size());
    }

    public static int diff_calc_level1(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int diff_calc_level4(int arg0, int arg1) {
        return diff_calc_level1(arg0, arg1);
    }

    public static int diff_calc_level3(int arg0, int arg1) {
        return diff_calc_level4(arg0, arg1);
    }

    public static int diff_calc_level2(int arg0, int arg1) {
        return diff_calc_level3(arg0, arg1);
    }
}