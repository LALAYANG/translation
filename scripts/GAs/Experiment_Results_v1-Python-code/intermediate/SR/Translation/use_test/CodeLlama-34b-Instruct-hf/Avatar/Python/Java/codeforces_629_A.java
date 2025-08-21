```java
import java.util.Scanner;

public class CakeHappiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakeSize = sc.nextInt();
        int[][] cake = new int[cakeSize][cakeSize];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;

        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                cake[i][j] = sc.nextInt();
                if (cake[i][j] == 'C') {
                    chocCount++;
                }
            }
            if (firstCondition & secondCondition) {
                if (chocCount > 1) {
                    nfat = recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }

        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                if (cake[i][j] == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k >= chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }

        System.out.println(happiness);
    }

    public static int recursiveChocolateFactorial(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return 1;
        }
        return index * recursiveChocolateFactorial(index + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
