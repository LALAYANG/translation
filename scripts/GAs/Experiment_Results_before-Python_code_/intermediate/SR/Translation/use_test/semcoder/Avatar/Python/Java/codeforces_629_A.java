Thought process:
1. Read the input integer `n` and initialize variables `happiness`, `chocCount`, and `nfat`.
2. Read the cake pattern into a 2D list `cake`.
3. Calculate the happiness based on the chocolate count and position.
4. Calculate the happiness for each row and column separately.
5. Print the final happiness value.

```java
import java.util.Scanner;

public class CakeHappiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] cake = new char[n][n];
        double happiness = 0;
        int chocCount = 0;
        double nfat = 1;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                cake[i][j] = line.charAt(j);
                if (cake[i][j] == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }

        int posCount = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i][j] == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }

        System.out.println((int) happiness);
    }
}
```
