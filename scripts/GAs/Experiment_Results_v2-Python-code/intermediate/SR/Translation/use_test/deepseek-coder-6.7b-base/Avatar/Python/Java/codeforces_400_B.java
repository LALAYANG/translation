```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] routes = new String[n];
        for (int i = 0; i < n; i++) {
            routes[i] = sc.nextLine();
        }
        sc.close();
        Set<Integer> distances = new HashSet<>();
        for (String route : routes) {
            int start = route.indexOf('S');
            int end = route.indexOf('G');
            distances.add(end - start);
        }
        if (distances.stream().anyMatch(distance -> distance < 0)) {
            System.out.println(-1);
        } else {
            System.out.println(distances.size());
        }
    }
}
```

