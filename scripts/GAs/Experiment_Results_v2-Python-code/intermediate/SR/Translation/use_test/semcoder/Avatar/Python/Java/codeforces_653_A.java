```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        for (int ValueIterator : l) {
            if ((ValueCheckerThree & ValueCheckerFive) != 0) {
                if ((ValueCheckerFour & ValueCheckerOne) != 0) {
                    if ((ValueCheckerSix & ValueCheckerTwo) != 0) {
                        if (Arrays.binarySearch(l, ValueIterator + 1) >= 0 && Arrays.binarySearch(l, ValueIterator + 2) >= 0) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
