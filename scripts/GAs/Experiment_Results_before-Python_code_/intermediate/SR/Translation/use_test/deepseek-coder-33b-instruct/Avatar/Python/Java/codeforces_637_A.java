```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }
        int c = -1;
        String a = "";
        for (int i = s.length - 1; i >= 0; i--) {
            if (w.get(s[i]) == Collections.max(w.values())) {
                if (i > c) {
                    a = s[i];
                    c = i;
                }
            }
        }
        System.out.println(a);
    }
}
```

