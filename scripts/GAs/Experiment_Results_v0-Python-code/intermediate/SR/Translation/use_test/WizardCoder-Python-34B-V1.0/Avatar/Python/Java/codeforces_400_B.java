```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_lines = scanner.nextInt();
        int dummy_var = scanner.nextInt();
        scanner.nextLine();
        HashSet<Integer> results = new HashSet<>();
        for (int i = 0; i < num_lines; i++) {
            String input_string = scanner.nextLine();
            int start_index = input_string.indexOf('S');
            int b_index = input_string.indexOf('G');
            int diff = diff_calc_level2(start_index, b_index);
            results.add(diff);
        }
        int result = -1;
        if (results.stream().allMatch(start_index -> start_index >= 0)) {
            result = results.size();
        }
        System.out.println(result);
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

    public static int calculate_difference(int start_index, int b) {
        return diff_calc_level2(start_index, b);
    }
}
```

Test input:
4 8
G*S*****
****G*S*
G*****S*
**G***S*

Expected output:
3 
