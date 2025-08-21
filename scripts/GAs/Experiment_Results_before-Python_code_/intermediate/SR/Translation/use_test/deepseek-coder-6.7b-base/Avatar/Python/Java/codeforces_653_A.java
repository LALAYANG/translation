
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l[i] + 1 == l[j] && l[j] + 1 == l[k]) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}

```

