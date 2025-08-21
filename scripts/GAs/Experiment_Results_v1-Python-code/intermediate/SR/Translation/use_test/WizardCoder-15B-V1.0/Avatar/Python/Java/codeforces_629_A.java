```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakeSize = sc.nextInt();
        sc.nextLine();
        int[][] cake = new int[cakeSize][cakeSize];
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;
        for (int i = 0; i < cakeSize; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < cakeSize; j++) {
                if (line.charAt(j) == 'C') {
                    chocCount++;
                }
                cake[i][j] = line.charAt(j) == 'C' ? 1 : 0;
            }
        }
        int happiness = 0;
        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                if (cake[i][j] == 1) {
                    chocCount++;
                }
                if (chocCount > 1 && (i >= firstCondition && i <= secondCondition) && (j >= firstCondition && j <= secondCondition)) {
                    nfat = 1;
                    for (int k = chocCount; k > 1; k--) {
                        nfat *= k;
                    }
                    happiness += nfat / 2;
                }
                chocCount = 0;
            }
        }
        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                if (cake[i][j] == 1) {
                    chocCount++;
                }
                if (chocCount > 1 && (i >= firstCondition && i <= secondCondition) && (j >= firstCondition && j <= secondCondition)) {
                    nfat = 1;
                    for (int k = chocCount; k > 1; k--) {
                        nfat *= k;
                    }
                    happiness += nfat / 2;
                }
                chocCount = 0;
            }
        }
        System.out.println(happiness);
    }
}
```
