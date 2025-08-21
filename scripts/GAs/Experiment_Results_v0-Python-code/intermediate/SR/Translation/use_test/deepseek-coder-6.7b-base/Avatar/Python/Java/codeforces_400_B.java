```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int dummy_var = scanner.nextInt();
        int[] results = new int[num_lines];
        for (int i = 0; i < num_lines; i++) {
            String input_string = scanner.next();
            results[i] = calculate_difference(input_string.indexOf('S'), input_string.indexOf('G'));
        }
        boolean has_negative = false;
        for (int i = 0; i < num_lines; i++) {
            if (results[i] < 0) {
                has_negative = true;
                break;
            }
        }
        if (has_negative) {
            System.out.println(-1);
        } else {
            int count = 0;
            for (int i = 0; i < num_lines; i++) {
                boolean found = false;
                for (int j = 0; j < i; j++) {
                    if (results[i] == results[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static int calculate_difference(int start_index, int b) {
        return diff_calc_level2(start_index, b);
    }

    public static int diff_calc_level2(int start_index, int b) {
        return diff_calc_level3(start_index, b);
    }

    public static int diff_calc_level3(int start_index, int b) {
        return diff_calc_level4(start_index, b);
    }

    public static int diff_calc_level4(int start_index, int b) {
        return diff_calc_level1(start_index, b);
    }

    public static int diff_calc_level1(int start_index, int b) {
        return start_index - b;
    }
}
```

