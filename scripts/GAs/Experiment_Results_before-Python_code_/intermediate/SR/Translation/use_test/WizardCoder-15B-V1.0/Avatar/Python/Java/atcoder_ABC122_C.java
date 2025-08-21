```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int[] problem = new int[2];
            problem[0] = sc.nextInt();
            problem[1] = sc.nextInt();
            problems.add(problem);
        }
        int[] cumsum = new int[n];
        cumsum[0] = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i] = cumsum[i - 1] + 1;
            } else {
                cumsum[i] = cumsum[i - 1];
            }
        }
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }
}
```
