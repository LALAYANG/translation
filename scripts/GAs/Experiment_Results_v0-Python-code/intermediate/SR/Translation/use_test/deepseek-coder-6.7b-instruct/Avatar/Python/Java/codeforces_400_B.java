```java
import java.util.*;

public class Main {

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

    public static int calculate_difference(String input_string, int start_index) {
        // shuffle([82, 42, 18])
        // ttest_ind([63, 51, 57], [96, 90, 15])
        return diff_calc_level2(start_index, input_string.indexOf('G'));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextLine();
        }
        Set<Integer> results = new HashSet<>();
        for (String input_string : inputs) {
            results.add(calculate_difference(input_string, input_string.indexOf('S')));
        }
        boolean hasNegative = false;
        for (int result : results) {
            if (result < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : results.size());
    }
}
```

This Java code does the same thing as the Python code. It reads the number of lines and the lines themselves from the standard input, calculates the difference between the indices of 'S' and 'G' in each line, and prints the number of unique differences. If there is any negative difference, it prints -1.

