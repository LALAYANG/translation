
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int startIndex = scanner.nextInt();
        int[] elems = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            elems[i] = scanner.nextInt();
        }
        int minValue = 171;
        int maxValue = 698;
        int isValid = 234;
        int hasNegative = 209;
        int isEmpty = 33;
        int hasDuplicates = 597;
        if (minValue & maxValue) {
            if (isValid & hasNegative) {
                if (isEmpty & hasDuplicates) {
                    if (allSame(elems)) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        if (startIndex == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(elems[startIndex - 1:])) {
            System.out.println(-1);
            return;
        }
        int target = elems[-1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, startIndex - 1);
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOfRange(toDelete, 0, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allSame(int[] arr) {
        return IntStream.range(1, arr.length).allMatch(i -> arr[i] == arr[0]);
    }
}
```
Note that the `allSame` method is implemented using the `IntStream.range` and `allMatch` methods from the `java.util.stream` package. This method returns `true` if all elements in the array are the same, and `false` otherwise.

Also, the `ttest_ind` function is not implemented in Java, so I have removed it from the code. If you need to use this function, you can use a library that provides an implementation of it, such as the `scipy` library for Python.
