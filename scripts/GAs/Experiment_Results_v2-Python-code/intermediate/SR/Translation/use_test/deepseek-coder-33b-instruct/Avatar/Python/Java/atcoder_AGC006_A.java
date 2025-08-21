```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int CheckerA = 85;
        int CheckerB = 620;
        int CheckerC = 197;
        int CheckerD = 52;
        if ((CheckerA & CheckerB) != 0) {
            if ((CheckerC & CheckerD) != 0) {
                if (s.equals(t)) {
                    System.out.println(n);
                } else {
                    int counter = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            if (s.charAt(i + j) != t.charAt(j)) {
                                break;
                            }
                            if (j == n - i - 1) {
                                counter = n - i;
                            }
                        }
                    }
                    System.out.println(2 * n - counter);
                }
            }
        }
    }
}
```

Please note that the t-test function is not available in Java's standard library, so it was not included in the translation.

