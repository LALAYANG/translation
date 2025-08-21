```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        for (int i : l) {
            if (Arrays.binarySearch(l, i + 1) >= 0 && Arrays.binarySearch(l, i + 2) >= 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input. It sorts the array and then checks if there are two consecutive numbers in the array. If it finds two consecutive numbers, it prints "YES" and stops. If it doesn't find any, it prints "NO".

Note: The `Arrays.binarySearch()` method in Java returns the index of the search key, if it is contained in the array, else it returns `- (insertion point) - 1`. The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key, or `a.length` if all elements in the array are less than the specified key.

