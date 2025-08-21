```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeSize = scanner.nextInt();
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;
        String[] cake = new String[cakeSize];
        for (int i = 0; i < cakeSize; i++) {
            cake[i] = scanner.next();
            for (int j = 0; j < cake[i].length(); j++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (firstCondition >= 0 && secondCondition >= 0) {
                if (chocCount > 1) {
                    happiness += recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        for (int j = 0; j < cakeSize; j++) {
            chocCount = 0;
            for (int i = 0; i < cakeSize; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                happiness += recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
            }
            nfat = 1;
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

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160 
