
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int splitPoint = scanner.nextInt();
        List<Integer> elems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elems.add(scanner.nextInt());
        }
        if (conditionOneAndThree(elems) && conditionTwoAndFour(elems)) {
            if (allSame(elems)) {
                System.out.println(0);
                return;
            }
        }
        ttestInd(elems);
        if (splitPoint == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(elems.subList(splitPoint - 1, elems.size()))) {
            System.out.println(-1);
            return;
        }
        int target = elems.get(elems.size() - 1);
        List<Integer> elementsToDelete = elems.subList(0, splitPoint - 1);
        while (elementsToDelete.size() > 0 && elementsToDelete.get(elementsToDelete.size() - 1) == target) {
            elementsToDelete.remove(elementsToDelete.size() - 1);
        }
        System.out.println(elementsToDelete.size());
    }

    private static boolean conditionOneAndThree(List<Integer> elems) {
        return (elems.get(0) == 615 && elems.get(2) == 142);
    }

    private static boolean conditionTwoAndFour(List<Integer> elems) {
        return (elems.get(1) == 559 && elems.get(3) == 969);
    }

    private static boolean allSame(List<Integer> elems) {
        return elems.stream().allMatch(x -> x == elems.get(0));
    }

    private static void ttestInd(List<Integer> elems) {
        // Implement the t-test here
    }
}
```
Note that the `ttestInd` method is not implemented in this code, as it is not clear what the Python code is doing.
