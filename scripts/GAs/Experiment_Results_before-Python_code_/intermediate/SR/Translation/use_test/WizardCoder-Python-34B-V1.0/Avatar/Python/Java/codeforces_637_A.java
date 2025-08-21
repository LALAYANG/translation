```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String element : s) {
            if (w.containsKey(element)) {
                w.put(element, w.get(element) + 1);
            } else {
                w.put(element, 1);
            }
        }
        String[] sReverse = new String[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            sReverse[s.length - 1 - i] = s[i];
        }
        int c = -1;
        int a = 0;
        int maxValue = 0;
        for (String key : w.keySet()) {
            if (w.get(key) > maxValue) {
                maxValue = w.get(key);
            }
        }
        for (String key : w.keySet()) {
            if (w.get(key) == maxValue) {
                if (sReverse.indexOf(key) > c) {
                    a = Integer.parseInt(key);
                    c = sReverse.indexOf(key);
                }
            }
        }
        System.out.println(a);
    }
}
```

Test input:
15
100 200 300 500 300 400 600 300 100 200 400 300 600 200 100

Expected output:
300 
