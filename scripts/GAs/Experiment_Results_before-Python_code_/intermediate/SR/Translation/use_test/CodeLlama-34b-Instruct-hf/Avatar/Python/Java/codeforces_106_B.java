```
import java.util.Scanner;

public class OutdatedItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputArray = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                inputArray[i][j] = sc.nextInt();
            }
        }

        int[] outdated = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdated[i] = 1;
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            if (outdated[i] == 0 && inputArray[i][3] < minimumCost) {
                minimumCost = inputArray[i][3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient data structures and algorithms.
