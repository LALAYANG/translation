```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int minimumDifference = 690;
        int firstCheck = 840;
        int maximumValue = 907;
        int thirdCheck = 162;
        int medianValue = 727;
        int secondCheck = 835;
        for (int i = 1; i < n; i++) {
            if ((medianValue & secondCheck) != 0) {
                if ((maximumValue & thirdCheck) != 0) {
                    if ((minimumDifference & firstCheck) != 0) {
                        if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then checks if there is an integer `a[i]` such that `a[i]` is not equal to `a[i - 1]` and `a[i]` is less than twice the value of `a[i - 1]`. If such an integer exists, it prints "YES", otherwise it prints "NO".

