```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 17, 49);
        Collections.shuffle(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It shuffles a list of integers, then calculates the sum of the shuffled list. The output is 131, which is the same as the Python code's output.

