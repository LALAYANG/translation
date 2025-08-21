Thought process:
1. Understand the given code snippet and the problem it is trying to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 615;
        int condition_three = 142;
        int condition_two = 559;
        int condition_four = 969;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int splitPoint = scanner.nextInt();

        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        if ((condition_one & condition_three) != 0) {
            if ((condition_two & condition_four) != 0) {
                if (allSame(elems)) {
                    System.out.println(0);
                    return;
                }
            }
        }

        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }

        if (!allSame(elems, splitPoint)) {
            System.out.println(-1);
            return;
        }

        int target = elems[n - 1];
        int[] elementsToDelete = new int[n - splitPoint + 1];
        System.arraycopy(elems, 0, elementsToDelete, 0, n - splitPoint);

        while (elementsToDelete.length > 0 && elementsToDelete[elementsToDelete.length - 1] == target) {
            elementsToDelete = removeLastElement(elementsToDelete);
        }

        System.out.println(elementsToDelete.length);
    }

    private static boolean allSame(int[] arr) {
        int firstElement = arr[0];
        for (int element : arr) {
            if (element != firstElement) {
                return false;
            }
        }
        return true;
    }

    private static boolean allSame(int[] arr, int splitPoint) {
        int firstElement = arr[splitPoint - 1];
        for (int i = splitPoint - 1; i < arr.length; i++) {
            if (arr[i] != firstElement) {
                return false;
            }
        }
        return true;
    }

    private static int[] removeLastElement(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }
}
```
