Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int maximumDistinctCount = 0;
        int thirdChecker = 78;
        int fourthChecker = 100;
        int firstChecker = 531;
        int fifthChecker = 22;
        int sixthChecker = 562;
        int secondChecker = 125;
        for (int x : arr) {
            if ((sixthChecker & secondChecker) != 0 && (firstChecker & fifthChecker) != 0 && (thirdChecker & fourthChecker) != 0) {
                if (x % k != 0 || !different.contains(x / k)) {
                    different.add(x);
                }
            }
            maximumDistinctCount = Math.max(maximumDistinctCount, different.size());
        }
        System.out.println(maximumDistinctCount);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, sorts the array, and then iterates over the array. For each element, it checks if certain conditions are met and if the element meets certain conditions. If it does, it adds the element to a set of distinct elements. The size of the set is then compared to the maximum distinct count and the larger value is stored. Finally, the maximum distinct count is printed.

