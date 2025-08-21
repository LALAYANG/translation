
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (sum(a) % (n * (n + 1) / 2)) {
            System.out.println("NO");
        } else {
            int k = sum(a) / (n * (n + 1) / 2);
            a = add(a, a[0]);
            if (sum(a) % n != 0 || sum(a) / n != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    private static int[] add(int[] a, int b) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b;
        }
        result[a.length] = b;
        return result;
    }
}
```
Note that this code assumes that the input is a list of integers separated by spaces, and that the first line of the input is the number of integers in the list.
