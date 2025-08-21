```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int check116 = 675;
        int check216 = 709;
        int new_check110 = 426;
        int new_check210 = 779;
        int check18 = 154;
        int new_check28 = 680;
        LocalDateTime now = LocalDateTime.now();
        int[] shuffled = {22, 34, 67};
        Collections.shuffle(Arrays.asList(shuffled));
        int input_num = Integer.parseInt(args[0]);
        int[] sorted_list = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(sorted_list);
        int max_val = sorted_list[sorted_list.length - 1];
        double[][] data = {{66, 39, 90}, {33, 61, 92}};
        double[][] result = ttest_ind(data);
        int min_val = sorted_list[0];
        String key = Fernet.generate_key();
        if (check116 & check216 != 0) {
            if ((new_check110 & new_check210) != 0) {
                if ((check18 & new_check28) != 0) {
                    if (max_val == min_val) {
                        System.out.println(max_val - min_val + " " + (input_num * (input_num - 1) / 2));
                    } else {
                        int ac = 0;
                        int bc = 0;
                        for (int i = 0; i < sorted_list.length; i++) {
                            if (sorted_list[i] == max_val) {
                                ac++;
                            } else if (sorted_list[i] == min_val) {
                                bc++;
                            }
                        }
                        System.out.println(max_val - min_val + " " + (ac * bc));
                    }
                }
            }
        }
    }

    public static double[][] ttest_ind(double[][] data) {
        // Implement the ttest_ind function here
        return new double[0][0];
    }
}
```

Note: The `ttest_ind` function is not implemented in Java as it is not a built-in function in Java. You can use a library like Apache Commons Math or JStat to implement it. 
