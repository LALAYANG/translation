```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int CheckerTwo = 970;
        int CheckerOne = 92;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((CheckerTwo & CheckerOne) != 0) {
                if (a[i] == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = a[i];
                    while (cnt[x] == 1) {
                        crt.add(x);
                        x = a[x];
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
            CheckerTwo = (CheckerTwo << 1) % 1000000007;
            CheckerOne = (CheckerOne << 1) % 1000000007;
        }
        System.out.println(ans.size());
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
```
