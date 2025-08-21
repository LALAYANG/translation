
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }
        if (allSame(elems)) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(elems, k - 1)) {
            System.out.println(-1);
            return;
        }
        int target = elems[n - 1];
        int[] toDelete = new int[k - 1];
        for (int i = 0; i < k - 1; i++) {
            toDelete[i] = elems[i];
        }
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean allSame(int[] arr, int k) {
        for (int i = k; i < arr.length; i++) {
            if (arr[i] != arr[k - 1]) {
                return false;
            }
        }
        return true;
    }
}
```
Note that this code uses the `Arrays.copyOf()` method to create a new array with the same elements as the original array, but with the last element removed. This is used to implement the `while` loop that removes the last element from the `toDelete` array if it is equal to the `target` element.
