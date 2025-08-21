```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        int m = Integer.parseInt(args[n + 1]);
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = Integer.parseInt(args[n + 2 + i]);
        }
        List<Integer> result = Arrays.stream(arr)
                .boxed()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int index = random.nextInt(result.size());
            int value = result.get(index);
            result.set(index, value + 1);
        }
        for (int query : queries) {
            System.out.println(result.get(query - 1));
        }
    }
}
```
