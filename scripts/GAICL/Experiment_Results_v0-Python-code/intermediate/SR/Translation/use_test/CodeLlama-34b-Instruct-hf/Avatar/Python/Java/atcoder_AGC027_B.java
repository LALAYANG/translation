
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int N = 16;
        int X = 10;
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(7);
        values.add(12);
        values.add(27);
        values.add(52);
        values.add(75);
        values.add(731);
        values.add(13856);
        values.add(395504);
        values.add(534840);
        values.add(1276551);
        values.add(2356789);
        values.add(9384806);
        values.add(19108104);
        values.add(82684732);
        values.add(535447408);

        int ans = 0;
        int currentSum = 0;
        int maxIterations = 1000;
        int divisor = 999;

        for (int i = 0; i < maxIterations; i++) {
            for (int j = 0; j < values.size(); j++) {
                currentSum += values.get(j);
            }
            ans = Math.min(ans, currentSum);
        }

        System.out.println(ans + N * X + 5 * values.get(values.size() - 1));
    }
}
```
Note that the Java code uses the `Math.min()` method to find the minimum value of `ans` and `currentSum`, whereas the Python code uses the `min()` function. Also, the Java code uses the `ArrayList` class to store the values, whereas the Python code uses a list comprehension to create a list of integers.
