```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        sc.close();
        int ans = recursive_function(input_number, "0");
        System.out.println(ans);
    }

    public static int recursive_function(int n, String s) {
        int ans = 0;
        if (n > 1000000000) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 10 == 7 || n % 10 == 5 || n % 10 == 3) {
            ans = recursive_function(n / 10, s + n % 10);
        }
        return ans;
    }
}
```
