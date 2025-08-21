```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            actions[index++] = directions[f ? 1 : 0];
        }
        for (int i = 0; i < inputString.length(); i++) {
            actions[index++] = "PRINT " + inputString.charAt(f ? inputString.length() - 1 - i : i);
            actions[index++] = directions[f ? 0 : 1];
        }
        for (int i = 0; i < index - 1; i++) {
            System.out.println(actions[i]);
        }
    }
}
```

