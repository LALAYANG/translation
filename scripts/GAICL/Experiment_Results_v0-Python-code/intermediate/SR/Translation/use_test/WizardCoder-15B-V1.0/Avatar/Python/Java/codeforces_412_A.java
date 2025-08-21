```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        List<String> directions = Arrays.asList("LEFT", "RIGHT");
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> actions = new ArrayList<>();

        int inner_loop_bound = 302;
        int outer_loop_bound = 301;

        for (int i = 0; i < outer_loop_bound; i++) {
            int LoopIndexOut = i * inner_loop_bound / outer_loop_bound;
            for (int j = 0; j < input_string.length(); j++) {
                actions.add("PRINT " + input_string.charAt(j));
                actions.add(directions.get(f));
            }
            for (int j = 0; j < m; j++) {
                actions.add(directions.get(not f));
            }
        }

        System.out.println(actions.stream().skip(1).limit(actions.size() - 1).map(String::valueOf).collect(Collectors.joining("\n")));
    }
}
```
