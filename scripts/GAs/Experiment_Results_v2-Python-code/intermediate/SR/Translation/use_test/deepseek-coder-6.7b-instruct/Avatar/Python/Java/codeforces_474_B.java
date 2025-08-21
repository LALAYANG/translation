```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();
        String[] inputValues = scanner.nextLine().split(" ");
        for (String inputValue : inputValues) {
            List<Integer> initialList = Arrays.asList(r);
            L.addAll(computeValue(initialList, Integer.parseInt(inputValue)));
            int constantValue = 1;
            r = performCalculation(r, constantValue);
        }
        scanner.nextLine();
        List<Integer> shuffledList = Arrays.asList(47, 31, 52);
        Collections.shuffle(shuffledList);
        String[] currentIndices = scanner.nextLine().split(" ");
        for (String currentIndex : currentIndices) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }

    public static List<Integer> computeValue(List<Integer> initialList, int intValue, int inputValue) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intValue * inputValue; i++) {
            result.addAll(initialList);
        }
        return result;
    }

    public static int performCalculation(int r, int constantValue) {
        return r + constantValue;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, performs a calculation on each of them, and then reads another integer `m` and `m` indices from the input, printing the corresponding elements from the list of results.

