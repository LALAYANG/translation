```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            w.put(num, w.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1) / 2;
            } else if (w.containsKey(-i)) {
                c += w.get(i) * w.get(-i) / 2;
            }
        }
        System.out.println(c);
    }
}
```
