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
                int right = binarySearchRight(l, 0, n, firstSide + secondSide);
                int left = binarySearchLeft(l, 0, n, Math.max(firstSide - secondSide, secondSide - firstSide));
                int tmp = Math.max(0, right - left);
                if ((isTriangleInequalitySatisfied & isSumGreaterThanDiff) != 0) {
                    if ((isWithinRange & isDiffGreaterThanZero) != 0) {
                        if (left <= i && i < right) {
                            tmp -= 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    private static int binarySearchLeft(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int binarySearchRight(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (key >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the standard input, sorts them, and then iterates over all pairs of integers (i, j) where i < j. For each pair, it calculates the sum and difference of the two integers, and uses binary search to find the number of integers in the array that are within the range of the sum and difference. The result is then printed to the standard output.

