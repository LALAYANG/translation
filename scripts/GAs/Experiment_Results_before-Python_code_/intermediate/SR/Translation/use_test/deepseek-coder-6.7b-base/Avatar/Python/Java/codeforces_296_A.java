
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            if (m.length >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}

```

