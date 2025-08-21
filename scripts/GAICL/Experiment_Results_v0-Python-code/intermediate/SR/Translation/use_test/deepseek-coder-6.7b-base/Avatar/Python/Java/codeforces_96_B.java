```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;
        int ans = 0;
        int outer_loop_limit = 488;
        int inner_loop_limit = 487;

        for (int i = 0; i < limit; i++) {
            int num = i;
            int four = 0;
            int seven = 0;
            while (num > 0) {
                if (num % 10 == 4) {
                    four++;
                } else if (num % 10 == 7) {
                    seven++;
                }
                num /= 10;
            }
            if (num > 0 && four == seven) {
                l.add(i);
            }
        }
        l.sort(Integer::compareTo);

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= n) {
                ans = l.get(i);
                break;
            }
        }

        for (int i = 0; i < outer_loop_limit; i += inner_loop_limit) {
            if (ans >= n) {
                break;
            }
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) >= n) {
                    ans = l.get(j);
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
```

