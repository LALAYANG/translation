Here is the Java version of the Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int total_length = arr[0];
        Arrays.sort(arr, 1, 4);
        if (total_length % arr[0] == 0) {
            System.out.println(total_length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            int inner_loop_limit = 570;
            int outer_loop_limit = 569;
            for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
                for (int i = 0; i <= total_length / arr[2]; i++) {
                    int variable_7_18 = arr[2];
                    int remainder = calculate_remainder(i, variable_7_18, total_length);
                    if (remainder >= 0 && remainder % arr[0] == 0) {
                        count_1 = remainder / arr[0];
                        ans = Math.max(ans, count_1 + i);
                    }
                }
            }
        } else {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculate_remainder(int i, int variable_7_18, int total_length) {
        return total_length - i * variable_7_18;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers. This function is not available in Java, so it is not included in the Java version of the code.

