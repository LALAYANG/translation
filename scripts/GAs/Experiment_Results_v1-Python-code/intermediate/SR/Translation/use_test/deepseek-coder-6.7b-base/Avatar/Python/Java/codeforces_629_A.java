```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakeSize = sc.nextInt();
        sc.nextLine();
        String[] cake = new String[cakeSize];
        for (int i = 0; i < cakeSize; i++) {
            cake[i] = sc.nextLine();
        }
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;
        for (int i = 0; i < cakeSize; i++) {
            for (int j = 0; j < cakeSize; j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (firstCondition & secondCondition) {
                if (chocCount > 1) {
                    for (int j = chocCount; j > chocCount - 2; j--) {
                        nfat *= j;
                    }
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < cakeSize; j++) {
            for (int i = 0; i < cakeSize; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int i = chocCount; i > chocCount - 2; i--) {
                    nfat *= i;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}
```

