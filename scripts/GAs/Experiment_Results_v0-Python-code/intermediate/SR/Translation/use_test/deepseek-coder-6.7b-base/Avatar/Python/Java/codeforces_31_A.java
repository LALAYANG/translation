```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (numbers[k] == numbers[i] + numbers[j]) {
                        System.out.println(k + 1 + " " + (j + 1) + " " + (i + 1));
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```

