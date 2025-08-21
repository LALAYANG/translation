
The provided Python code is a bit complex and contains several variables and functions that are not used in the code. However, I can provide a Java implementation of the main logic of the code.

Here is a possible Java implementation of the code:
```java
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
        int target = elems[startIndex - 1];
        int toDelete = 0;
        for (int i = startIndex - 1; i < numElements; i++) {
            if (elems[i] == target) {
                toDelete++;
            } else {
                break;
            }
        }
        System.out.println(toDelete);
    }
}
```
This code reads the input from the user, stores it in an array, and then finds the number of elements to delete from the start of the array that are equal to the target element. Finally, it prints the number of elements to delete.

Note that this code assumes that the input is valid and that the start index is greater than 0. If the input is not valid or the start index is 0, the code will throw an exception.
