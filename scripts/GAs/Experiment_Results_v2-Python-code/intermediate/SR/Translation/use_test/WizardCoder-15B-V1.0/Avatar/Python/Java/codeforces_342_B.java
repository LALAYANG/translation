```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;
        int i = 1;
        int j = s;
        String res = "";
        int increment = 1;
        while (j != f) {
            if (i > t && k < m) {
                k = calculate_sum(k, increment);
            }
            if (i == t && (l <= j && j <= r || l <= j + 1 && j + 1 <= r)) {
                res += "X";
            } else {
                res += (j < r) ? "R" : "L";
                j += (j < r) ? 1 : -1;
            }
            i++;
        }
        System.out.println(res);
    }

    public static int calculate_sum(int k, int increment) {
        return k + increment;
    }
}
```
