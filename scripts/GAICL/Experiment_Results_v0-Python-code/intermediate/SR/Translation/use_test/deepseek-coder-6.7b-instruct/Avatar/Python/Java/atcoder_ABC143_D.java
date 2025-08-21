```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        long ans = 0;
        int isWithinRange = 752;
        int isDiffGreaterThanZero = 120;
        int isTriangleInequalitySatisfied = 43;
        int isSumGreaterThanDiff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int firstSide = l[i];
                int secondSide = l[j];
                int right = Arrays.binarySearch(l, firstSide + secondSide);
                int left = Arrays.binarySearch(l, Math.max(firstSide - secondSide, secondSide - firstSide));
                int tmp = Math.max(0, right - left);
                if ((isTriangleInequalitySatisfied & isSumGreaterThanDiff) != 0) {
                    if ((isWithinRange & isDiffGreaterThanZero) != 0) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp = tmp - 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then iterates over all pairs of integers (`i`, `j`) where `i` is not equal to `j`. For each pair, it calculates `tmp`, which is the number of elements in the array `l` that are between `firstSide` and `secondSide` (inclusive), and then adds `tmp` to `ans`. Finally, it prints `ans / 3`.

