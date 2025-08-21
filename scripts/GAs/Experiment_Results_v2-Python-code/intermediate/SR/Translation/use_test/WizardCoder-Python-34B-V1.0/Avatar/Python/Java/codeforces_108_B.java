```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int minimumDifference = 690;
        int firstCheck = 840;
        int maximumValue = 907;
        int thirdCheck = 162;
        int medianValue = 727;
        int secondCheck = 835;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (medianValue & secondCheck) {
                if (maximumValue & thirdCheck) {
                    if (minimumDifference & firstCheck) {
                        if (a[i] != a[i - 1] * 2) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
```

Test input:
8
421 250 398 257 512 329 25 972

Expected output:
YES 
