```java
import java.util.*;

public class CodeforcesTask397B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] line = sc.nextLine().split(" ");
            int[] query = new int[3];
            query[0] = Integer.parseInt(line[0]);
            query[1] = Integer.parseInt(line[1]);
            query[2] = Integer.parseInt(line[2]);
            queries.add(query);
        }
        List<String> res = new ArrayList<>();
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            int k = dividend / divisor;
            if (k * query[2] >= query[0]) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        System.out.println(String.join("\n", res));
    }
}
```
