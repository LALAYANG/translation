```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = temp;
            }
        }
        System.out.println(counterTurns);
    }
}
```
