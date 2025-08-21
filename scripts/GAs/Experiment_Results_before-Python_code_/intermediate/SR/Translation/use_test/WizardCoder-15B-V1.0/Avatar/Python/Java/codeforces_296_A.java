```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.next().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(m));
        boolean possible = true;
        for (String i : set) {
            if (Collections.frequency(Arrays.asList(m), i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```
