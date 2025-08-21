```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] lst = new Integer[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst, Collections.reverseOrder());
        int od = 0;
        for (int i : lst) {
            if (i % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}
```

