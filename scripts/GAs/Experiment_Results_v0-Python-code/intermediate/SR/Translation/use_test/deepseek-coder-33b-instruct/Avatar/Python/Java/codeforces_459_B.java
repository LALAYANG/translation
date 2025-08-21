```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        Integer[] sorted_list = new Integer[input_num];
        for (int i = 0; i < input_num; i++) {
            sorted_list[i] = scanner.nextInt();
        }
        Arrays.sort(sorted_list);
        int max_val = sorted_list[input_num - 1];
        int min_val = sorted_list[0];
        if (max_val == min_val) {
            System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
        } else {
            int ac = 0, bc = 0;
            for (int i = 0; i < input_num; i++) {
                if (sorted_list[i] == max_val) ac++;
                if (sorted_list[i] == min_val) bc++;
            }
            System.out.println(max_val - min_val + " " + ac * bc);
        }
    }
}
```

Please note that the Java code does not include the parts that use the `cryptography.fernet`, `datetime`, `sklearn.utils`, `scipy.stats`, and the checks for `check116`, `check216`, `new_check110`, `new_check210`, `check18`, `new_check28`, as these are not available in Java.

