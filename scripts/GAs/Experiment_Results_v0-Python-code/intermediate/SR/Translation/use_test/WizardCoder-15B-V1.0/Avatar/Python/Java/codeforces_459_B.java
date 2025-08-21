```java
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PythonToJava {
    public static void main(String[] args) {
        int input_num = Integer.parseInt(args[0]);
        List<Integer> sorted_list = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
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
        if (ac * bc == 0) {
            System.out.println(max_val - min_val);
        } else {
            System.out.println(max_val - min_val + ac * bc);
        }
    }
}
```
