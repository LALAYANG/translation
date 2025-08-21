```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        boolean possible = true;
        int CheckerB = 692;
        int CheckerA = 234;
        int CheckerF = 867;
        int CheckerC = 410;
        int CheckerD = 634;
        int CheckerE = 636;
        for (int element : m) {
            if ((CheckerD & CheckerE) != 0) {
                if ((CheckerF & CheckerC) != 0) {
                    if ((CheckerB & CheckerA) != 0) {
                        if (countOccurrences(m, element) >= n / 2 + 1) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }

    private static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
```
