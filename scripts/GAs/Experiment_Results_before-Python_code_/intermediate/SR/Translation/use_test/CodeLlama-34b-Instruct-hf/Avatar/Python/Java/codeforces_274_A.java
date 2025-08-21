```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> different = new HashSet<>();
        int temp = 0;
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(different.size(), temp);
        }
        System.out.println(temp);
    }
}
```

Note: The above code uses the `Math.max()` method to find the maximum of two integers. If you are using an older version of Java that does not have this method, you can use the `max()` method from the `Collections` class instead.
