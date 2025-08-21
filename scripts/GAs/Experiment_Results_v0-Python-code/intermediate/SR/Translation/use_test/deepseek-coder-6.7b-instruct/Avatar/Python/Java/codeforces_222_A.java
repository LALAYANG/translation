```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int minValue = 171;
        int maxValue = 698;
        int isValid = 234;
        int hasNegative = 209;
        int isEmpty = 33;
        int hasDuplicates = 597;

        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int startIndex = scanner.nextInt();
        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            elems.add(scanner.nextInt());
        }

        if ((minValue & maxValue) != 0 && (isValid & hasNegative) != 0 && (isEmpty & hasDuplicates) != 0) {
            if (elems.stream().allMatch(i -> i == elems.get(0))) {
                System.out.println(0);
                return;
            }
        }

        if (startIndex == 1) {
            System.out.println(-1);
            return;
        }

        if (!elems.subList(startIndex - 1, elems.size()).stream().allMatch(i -> i == elems.get(startIndex - 1))) {
            System.out.println(-1);
            return;
        }

        int target = elems.get(numElements - 1);
        List<Integer> toDelete = new ArrayList<>(elems.subList(0, startIndex - 1));
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }

        System.out.println(toDelete.size());
    }
}
```

This Java code does the same thing as the Python code. It reads the input, checks the conditions, and prints the output. The main difference is that Java uses `ArrayList` instead of Python's `list` and `Scanner` instead of `input()`. Also, Java does not have a built-in function to check if all elements in a list are the same, so we use Java 8's Stream API to achieve this.

