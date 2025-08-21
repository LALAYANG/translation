Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(temp, different.size());
        }
        System.out.println(temp);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k` from the input, then reads `n` integers into an array. It sorts the array, then iterates over it. For each number `x` in the array, it checks if `x` is not divisible by `k` or if `x / k` is not in the set of different numbers. If either condition is true, it adds `x` to the set of different numbers. It then updates `temp` to be the maximum of its current value and the size of the set of different numbers. Finally, it prints `temp`.

