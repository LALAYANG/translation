```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        for (int i = 0; i < l.size() - 2; i++) {
            if (l.get(i) + 1 == l.get(i + 1) && l.get(i) + 2 == l.get(i + 2)) {
                System.out.println("YES");
                break;
            }
        }
        if (l.size() < 3) {
            System.out.println("NO");
        }
    }
}
```
