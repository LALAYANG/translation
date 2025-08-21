```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[m * 2 + input_string.length() * 2];
        int index = 0;
        for (int i = 0; i < m; i++) {
            actions[index++] = directions[f ? 1 : 0];
        }
        for (int i = 0; i < input_string.length(); i++) {
            actions[index++] = "PRINT " + input_string.charAt(f ? input_string.length() - 1 - i : i);
            actions[index++] = directions[f ? 0 : 1];
        }
        for (int i = 0; i < m; i++) {
            actions[index++] = directions[f ? 0 : 1];
        }
        for (int i = 0; i < actions.length - 1; i++) {
            System.out.println(actions[i]);
        }
    }
}
```

