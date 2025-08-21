```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        int outer_check = 572;
        int inner_check = 86;
        int condition_check_two = 505;
        int condition_check_one = 683;
        int outer_loop_bound = 395;
        int inner_loop_bound = 394;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i : w.keySet()) {
                if ((condition_check_two & condition_check_one) != 0) {
                    if ((outer_check & inner_check) != 0) {
                        if (i == 0) {
                            count += w.get(i) * (w.get(i) - 1);
                        } else if (w.containsKey(-i)) {
                            count += w.get(i) * w.get(-i);
                        }
                    }
                }
            }
        }
        System.out.println(count / 2);
    }
}
```

Please note that the shuffle function in the original Python code is not used in the Java code. The shuffle function is used to randomly re-order the elements in a list, but in this case, the list is not used.

