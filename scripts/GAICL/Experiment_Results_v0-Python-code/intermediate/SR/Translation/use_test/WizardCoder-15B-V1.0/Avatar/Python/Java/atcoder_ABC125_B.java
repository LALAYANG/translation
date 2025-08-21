```java
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num_items = Integer.parseInt(args[0]);
        List<Integer> V = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).toList();
        List<Integer> costs = Arrays.stream(args[2].split(" ")).map(Integer::parseInt).toList();
        List<Integer> list = Arrays.asList(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            for (int item_index = 0; item_index < num_items; item_index++) {
                if (item_index >= num_items - 1) {
                    break;
                }
                if (V.get(item_index) - costs.get(item_index) > 0) {
                    X = V.get(item_index);
                    Y = costs.get(item_index);
                    list.add(X - Y);
                }
            }
        }
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
```
