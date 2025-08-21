```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (l.containsKey(lst[i])) {
                l.put(lst[i], l.get(lst[i]) + 1);
            } else {
                l.put(lst[i], 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

