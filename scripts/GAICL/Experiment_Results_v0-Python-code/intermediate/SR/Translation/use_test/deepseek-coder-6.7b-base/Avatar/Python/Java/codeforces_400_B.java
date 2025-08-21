```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_lines = sc.nextInt();
        int dummy_var = sc.nextInt();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < num_lines; i++) {
            String input_string = sc.next();
            int start_index = input_string.indexOf('S');
            int end_index = input_string.indexOf('G');
            results.add(start_index - end_index);
        }
        if (results.stream().anyMatch(start_index -> start_index < 0)) {
            System.out.println(-1);
        } else {
            System.out.println(results.size());
        }
    }
}
```

