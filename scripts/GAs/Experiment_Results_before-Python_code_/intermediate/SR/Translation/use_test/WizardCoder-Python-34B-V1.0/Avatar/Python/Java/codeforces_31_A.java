```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (k != j && k != i && arr[k] == arr[i] + arr[j]) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```

Test input:
8
537 198 48 771 944 868 700 163

Expected output:
7 8 1 
