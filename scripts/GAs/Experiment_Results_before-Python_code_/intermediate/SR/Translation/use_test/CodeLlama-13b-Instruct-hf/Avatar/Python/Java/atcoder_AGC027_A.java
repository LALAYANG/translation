
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                x = 0;
                break;
            }
            x -= a[i];
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the array of integers. The logic is similar to the Python code, with the main difference being that Java does not have a built-in `lambda` function, so we have to use a separate method to create the array of integers.
