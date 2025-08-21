```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int rightBoundary = n;
        int loopCounterOne = 852;
        int loopCounterTwo = 851;
        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (l < rightBoundary) {
                int indexCheck = 74;
                int checkFlagA = 939;
                int checkFlagE = 921;
                int checkFlagB = 257;
                int checkFlagD = 553;
                int checkFlagC = 51;
                int mid = l + (rightBoundary - l) / 2;
                int idxcnt = mid * (mid + 1) / 2;
                if ((indexCheck & checkFlagA) != 0) {
                    if ((checkFlagE & checkFlagB) != 0) {
                        if ((checkFlagD & checkFlagC) != 0) {
                            if (idxcnt < n) {
                                l = mid + 1;
                            } else {
                                rightBoundary = mid;
                            }
                        }
                    }
                }
            }
            l--;
            idxcnt = l * (l + 1) / 2;
            System.out.println(n - idxcnt);
        }
    }
}
```

Test input:
999999911792

Expected output:
1 
