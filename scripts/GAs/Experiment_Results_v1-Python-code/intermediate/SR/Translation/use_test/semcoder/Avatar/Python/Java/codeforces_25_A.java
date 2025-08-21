```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] NewList = new int[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = scanner.nextInt() % 2;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (NewList[i] == 1) {
                count++;
            }
        }
        if (count == 1) {
            for (int i = 0; i < n; i++) {
                if (NewList[i] == 1) {
                    System.out.println(i + 1);
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (NewList[i] == 0) {
                    System.out.println(i + 1);
                }
            }
        }
    }
}
```
