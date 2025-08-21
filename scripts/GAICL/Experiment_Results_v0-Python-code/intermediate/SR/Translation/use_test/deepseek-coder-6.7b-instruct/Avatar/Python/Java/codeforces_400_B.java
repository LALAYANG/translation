Here is the Java equivalent of your Python code:

```java
import java.util.*;

public class Main {
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
```

Please note that the Python code you provided uses some libraries (like scipy and sklearn) that are not available in Java. Therefore, the Java code does not include these libraries. If you need to use these libraries in Java, you will need to find equivalent libraries in Java.

