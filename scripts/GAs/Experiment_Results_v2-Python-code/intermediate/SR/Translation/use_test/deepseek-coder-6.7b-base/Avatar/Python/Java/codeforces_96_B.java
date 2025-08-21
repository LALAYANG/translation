```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        l.add(0);
        for (int i = 0; i < limit; i++) {
            int last = l.get(l.size() - 1);
            if (last > 0 && last % 4 == 0 && last % 7 == 0) {
                l.add(last * 10 + 4);
                l.add(last * 10 + 7);
            } else if (last % 4 == 0) {
                l.add(last * 10 + 4);
            } else if (last % 7 == 0) {
                l.add(last * 10 + 7);
            }
        }
        l.sort(Integer::compareTo);
        int minimum_value = 0;
        int outer_loop_limit = 422;
        int inner_loop_limit = 421;
        for (int i = 0; i < outer_loop_limit; i++) {
            for (int j = 0; j < inner_loop_limit; j++) {
                if (l.get(i * inner_loop_limit + j) >= n) {
                    minimum_value = l.get(i * inner_loop_limit + j);
                    break;
                }
            }
        }
        System.out.println(minimum_value);
    }
}
```

