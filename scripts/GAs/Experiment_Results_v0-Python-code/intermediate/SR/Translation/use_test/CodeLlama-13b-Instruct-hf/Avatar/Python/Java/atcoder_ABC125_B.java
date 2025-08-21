
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numItems = scanner.nextInt();
        int[] V = new int[numItems];
        int[] costs = new int[numItems];
        for (int i = 0; i < numItems; i++) {
            V[i] = scanner.nextInt();
        }
        for (int i = 0; i < numItems; i++) {
            costs[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            recursiveFunc(0, numItems, 1);
        }
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

    public static void recursiveFunc(int itemIndex, int stop, int step) {
        if (step == 0 || (step > 0 && itemIndex >= stop) || (step < 0 && itemIndex <= stop)) {
            return;
        }
        if (CONDITION_1 & CONDITION_2) {
            if (V[itemIndex] - costs[itemIndex] > 0) {
                X = V[itemIndex];
                Y = costs[itemIndex];
                list.add(X - Y);
            }
        }
        recursiveFunc(itemIndex + step, stop, step);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of items. The `stream()` method is used to convert the list to a stream, and the `mapToInt()` method is used to convert the stream of `Integer` objects to a stream of `int` values. Finally, the `sum()` method is used to calculate the sum of the elements in the stream.
