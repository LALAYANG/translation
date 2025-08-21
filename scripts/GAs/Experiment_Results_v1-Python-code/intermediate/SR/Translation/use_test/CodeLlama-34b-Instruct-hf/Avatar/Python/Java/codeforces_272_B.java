```java
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class NPairsWithCommonFX {
    public static void main(String[] args) {
        int[] sequence = {2, 7, 1};
        int result = nPairsWithCommonFX(sequence);
        System.out.println(result);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, Integer> storage = new HashMap<>();
        Queue<Integer> FXs = new LinkedList<>();
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;

        for (int value : sequence) {
            int y = f(value);
            if (conditionalCheckTwo & conditionalCheckFour) {
                if (conditionalCheckOne & conditionalCheckThree) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, value);
                        FXs.add(y);
                    } else {
                        storage.get(y).add(value);
                    }
                }
            }
        }

        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        return (sum - FXs.size()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `HashMap` to store the values of `y` and their corresponding `value`s, and a `Queue` to store the `y` values that meet the conditions. The `f` function is also implemented in Java. The `main` method is used to test the `nPairsWithCommonFX` method with the input sequence `[2, 7, 1]`.
