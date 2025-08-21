```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        int flagA = 485;
        int flagB = 552;
        int thresholdA = 740;
        int flagC = 233;
        int maskA = 503;
        int maskB = 818;
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            for (int p = 0; p < n; p++) {
                if ((maskA & maskB) != 0) {
                    if ((thresholdA & flagC) != 0) {
                        if ((flagA & flagB) != 0 && M[p] == 0) {
                            System.out.print(p + 1 + " ");
                            break;
                        }
                    }
                }
            }
            for (int l = 0; l < p - k; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
``` 
