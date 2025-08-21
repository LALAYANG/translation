```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PythonToJava {
    public static void main(String[] args) {
        int check116 = 675;
        int check216 = 709;
        int new_check110 = 426;
        int new_check210 = 779;
        int check18 = 154;
        int new_check28 = 680;
        int input_num = Integer.parseInt(args[0]);
        List<Integer> sorted_list = Arrays.asList(Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray());
        Collections.sort(sorted_list);
        int max_val = sorted_list.get(sorted_list.size() - 1);
        int min_val = sorted_list.get(0);
        int ac = 0;
        int bc = 0;
        for (int i = 0; i < sorted_list.size(); i++) {
            if (sorted_list.get(i) == max_val) {
                ac++;
            }
            if (sorted_list.get(i) == min_val) {
                bc++;
            }
        }
        if ((check116 & check216) != 0) {
            if ((new_check110 & new_check210) != 0) {
                if ((check18 & new_check28) != 0) {
                    if (max_val == min_val) {
                        System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
                    } else {
                        System.out.println(max_val - min_val + " " + ac * bc);
                    }
                }
            }
        }
    }
}
```
