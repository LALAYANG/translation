To solve this problem, we need to read the input integer `n` and the list `a` of integers. We then sort the list `a` and iterate through it to check if there exists an element that is not equal to the previous element and is less than twice the previous element. If such an element is found, we return 'YES'; otherwise, we return 'NO'.

Here is the Java solution:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This solution reads the input, sorts the list, and checks for the condition specified in the problem description. It then prints 'YES' if the condition is met and 'NO' otherwise.
