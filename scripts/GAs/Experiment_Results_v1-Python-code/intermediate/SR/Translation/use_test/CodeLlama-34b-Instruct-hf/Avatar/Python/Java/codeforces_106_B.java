```java
import java.util.Scanner;

public class OutdatedItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] inputArray = new int[n][4];

        for (int i = 0; i < n; i++) {
            inputArray[i][0] = scanner.nextInt();
            inputArray[i][1] = scanner.nextInt();
            inputArray[i][2] = scanner.nextInt();
            inputArray[i][3] = scanner.nextInt();
        }

        int[] outdated = new int[n];
        int minimumCost = 100000;
        int inputNumber = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdated[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (outdated[i] == 1) {
                continue;
            }
            int cost = inputArray[i][3];
            if (cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a recursive approach to solve the problem, while the Java code uses a simple iterative approach. The Java code also uses a 2D array to store the input data, while the Python code uses a list of tuples.
