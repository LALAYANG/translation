```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        for (int i = 0; i < n; i++) {
            cake[i] = scanner.next();
            for (int j = 0; j < n; j++) {
                if (cake[i].charAt(j) == 'C') {
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
        for (int j = 0; j < n; j++) {
            chocCount = 0;
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
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
        }
        System.out.println(happiness);
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
