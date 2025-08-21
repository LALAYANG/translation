Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1, b = Integer.MIN_VALUE;
        for (int i : lis) {
            if (i > b) {
                b = i;
            }
        }
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= (i / mid);
        }
        return k >= 0;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, checks if the mid value is a valid answer, and updates the answer if it is. The `check` method checks if there are enough elements in the list that are divisible by the mid value. If there are, it decreases the count of such elements and increases the count of elements that can be divided by the mid value. If the count of elements that can be divided by the mid value is greater or equal to the count of elements that are divisible by the mid value, it means that the mid value is a valid answer and the function returns `true`. Otherwise, it returns `false`.

