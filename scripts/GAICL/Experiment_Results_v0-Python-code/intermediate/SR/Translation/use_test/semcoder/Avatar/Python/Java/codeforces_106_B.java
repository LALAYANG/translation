Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

Solution:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int strength = scanner.nextInt();
            int R = scanner.nextInt();
            int health = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new int[]{strength, R, health, C});
        }

        List<int[]> outdatedItems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdatedItems.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = Integer.MAX_VALUE;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdatedItems.contains(currentItem) && cost < minimumCost) {
                minimumCost = currentItem[3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```

This Java solution reads the input, identifies outdated items, and selects the item with the minimum cost that is not outdated.
