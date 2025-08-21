```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        boolean isPossible = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m[i] == m[j]) {
                    isPossible = false;
                    break;
                }
            }
        }
        System.out.println(isPossible ? "YES" : "NO");
    }
}
```

