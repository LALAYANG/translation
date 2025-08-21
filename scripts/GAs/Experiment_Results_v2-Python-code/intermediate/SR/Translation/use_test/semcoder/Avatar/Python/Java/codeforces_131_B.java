```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            w.put(key, w.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                count += w.get(i) * (w.get(i) - 1);
            } else if (-i in w) {
                count += w.get(i) * w.get(-i);
            }
        }
        System.out.println(count / 2);
    }
}
```
