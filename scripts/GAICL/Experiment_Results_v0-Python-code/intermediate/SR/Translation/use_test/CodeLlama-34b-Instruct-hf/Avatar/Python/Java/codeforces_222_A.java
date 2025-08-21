```
import java.util.Scanner;

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
        boolean isValid = true;
        boolean hasNegative = false;
        boolean isEmpty = false;
        boolean hasDuplicates = false;

        for (int i = 0; i < numElements; i++) {
            if (elems[i] < minValue || elems[i] > maxValue) {
                isValid = false;
                break;
            }
            if (elems[i] < 0) {
                hasNegative = true;
            }
            if (elems[i] == 0) {
                isEmpty = true;
            }
            for (int j = i + 1; j < numElements; j++) {
                if (elems[i] == elems[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (isValid && hasNegative && isEmpty && hasDuplicates) {
            System.out.println(0);
            return;
        }

        if (startIndex == 1) {
            System.out.println(-1);
            return;
        }

        int target = elems[startIndex - 1];
        int toDelete = 0;
        for (int i = startIndex - 1; i < numElements; i++) {
            if (elems[i] == target) {
                toDelete++;
            }
        }
        System.out.println(toDelete);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It is not a direct translation, but rather a semantically equivalent program that should produce the same output for the same input. The Python code uses some advanced features like list comprehensions and lambda functions, which are not directly translatable to Java. Therefore, the Java code uses a more verbose approach to achieve the same functionality.
