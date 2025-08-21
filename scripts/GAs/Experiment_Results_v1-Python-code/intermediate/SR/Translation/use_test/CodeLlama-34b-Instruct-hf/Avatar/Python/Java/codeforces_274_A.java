```java
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class DistinctCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int maximumDistinctCount = 0;
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
                maximumDistinctCount = Math.max(maximumDistinctCount, different.size());
            }
        }
        System.out.println(maximumDistinctCount);
    }
}
```
Note: In the Java code, I have used `HashSet` instead of `set` as it is not a built-in data structure in Java. Also, I have used `Math.max` instead of `np.max` as it is not a built-in function in Java.
