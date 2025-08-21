```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int splitPoint = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        // Condition 1: All elements are the same
        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (elems[i] != elems[0]) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            System.out.println(0);
            return;
        }

        // Condition 2: The split point is 1
        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }

        // Condition 3: All elements after the split point are the same
        boolean allSameAfterSplit = true;
        for (int i = splitPoint; i < n; i++) {
            if (elems[i] != elems[splitPoint - 1]) {
                allSameAfterSplit = false;
                break;
            }
        }
        if (!allSameAfterSplit) {
            System.out.println(-1);
            return;
        }

        // Condition 4: The target element is the last element
        int target = elems[n - 1];

        // Condition 5: The elements to delete are all the same as the target element
        int[] elementsToDelete = new int[splitPoint - 1];
        for (int i = 0; i < splitPoint - 1; i++) {
            elementsToDelete[i] = elems[i];
        }
        boolean allSameAsTarget = true;
        for (int i = 0; i < splitPoint - 1; i++) {
            if (elementsToDelete[i] != target) {
                allSameAsTarget = false;
                break;
            }
        }
        if (!allSameAsTarget) {
            System.out.println(-1);
            return;
        }

        // Print the number of elements to delete
        System.out.println(splitPoint - 1);
    }
}
```
Note: The code above is a direct translation of the Python code you provided, but it may not be the most efficient or elegant way to solve the problem in Java.
