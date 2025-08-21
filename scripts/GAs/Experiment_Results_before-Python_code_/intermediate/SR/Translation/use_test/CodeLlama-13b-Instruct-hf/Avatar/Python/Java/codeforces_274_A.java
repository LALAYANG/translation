```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
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
This is a Java implementation of the given Python code. It uses the `Scanner` class to read input from the user, and the `Set` and `HashSet` classes to keep track of the different numbers. The `Math.max` method is used to find the maximum size of the set.

Note that the `Set` class in Java is a generic class, so we need to specify the type of elements it will contain. In this case, we use `Integer` to represent the numbers.
