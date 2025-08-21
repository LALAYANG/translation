```java
import java.util.Scanner;

public class OutdatedInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = scanner.nextInt();
        int[][] inputArray = new int[numInputs][4];

        for (int i = 0; i < numInputs; i++) {
            inputArray[i][0] = scanner.nextInt();
            inputArray[i][1] = scanner.nextInt();
            inputArray[i][2] = scanner.nextInt();
            inputArray[i][3] = scanner.nextInt();
        }

        int[] outdated = new int[numInputs];
        int outdatedCount = 0;

        for (int i = 0; i < numInputs; i++) {
            for (int j = i + 1; j < numInputs; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdated[outdatedCount++] = i;
                    break;
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;

        for (int i = 0; i < numInputs; i++) {
            if (outdated[i] == -1) {
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
Note: The above code is a Java implementation of the given Python code. The Python code uses a recursive approach to read the input and find the outdated inputs, while the Java code uses a simple loop to read the input and find the outdated inputs. The Java code also uses a separate loop to find the minimum cost and the corresponding input number.
