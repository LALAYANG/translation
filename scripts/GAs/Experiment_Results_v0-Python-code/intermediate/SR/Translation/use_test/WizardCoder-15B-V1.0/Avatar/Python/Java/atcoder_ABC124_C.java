```java
import java.util.*;

public class PythonToJava {

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
        int[] even_counts = new int[26];
        int[] odd_counts = new int[26];
        for (int i = 0; i < input_string.length(); i++) {
            char c = input_string.charAt(i);
            if (i % 2 == 0) {
                even_counts[c - 'a']++;
            } else {
                odd_counts[c - 'a']++;
            }
        }
        int min_count = Math.min(input_string.length() - calculate_sum(even_counts[0], odd_counts[1]), input_string.length() - (even_counts[1] + odd_counts[0]));
        System.out.println(min_count);
    }
}
```
