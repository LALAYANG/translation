```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = Math.signum(a[i]);
                maxIndex = i;
            }
        }

        if (maxSign == 0) {
            System.out.println(0);
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println(maxIndex + 1 + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `map()` function to create a list of lists, but in Java, we use the `ArrayList` class to create a list of lists.
