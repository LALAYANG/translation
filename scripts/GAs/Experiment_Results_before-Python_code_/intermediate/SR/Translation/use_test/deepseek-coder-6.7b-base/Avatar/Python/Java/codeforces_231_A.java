
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = sc.nextInt();
            }
            if (l1[0] + l1[1] + l1[2] > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

