```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
        }
        int[] t = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
        }
        int check_value = 239;
        int max_value = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0 && t[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                int x = i;
                while (values[x] != 0) {
                    crt.add(x);
                    x = values[x];
                }
                if (crt.size() > ans.size()) {
                    ans = crt;
                }
            }
        }
        System.out.println(ans.size());
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
```
