Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;
        if ((condition_1 & condition_2) != 0) {
            if ((check_condition_1 & check_condition_2) != 0) {
                int sum = Arrays.stream(a).sum();
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    double k = sum / (n * (n + 1) / 2.0);
                    int[] newA = Arrays.copyOf(a, a.length + 1);
                    newA[a.length] = a[0];
                    double sum2 = 0;
                    for (int i = 1; i < newA.length; i++) {
                        sum2 += (k - newA[i] + newA[i - 1]) % n;
                    }
                    if (sum2 != n || sum2 / n < 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}
```

Please note that Java does not have a direct equivalent to Python's bitwise AND operator (&). Instead, we use the bitwise AND operator (&) with zero (`(condition_1 & condition_2) != 0`) to check if both conditions are true. Also, Java does not have a direct equivalent to Python's `numpy` library. Instead, we use Java's `Arrays` class to calculate the sum of the array.

