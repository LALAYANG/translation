```java
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (set(String.valueOf(n)).equals("753")) {
            ans = 0;
        }
        for (int i = 0; i < 3; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }
}
```
Note: In the Java code, I have used the `set` method to convert the integer `n` to a string and then check if it contains only the digits '7', '5', and '3'. If it does, then the `ans` variable is set to 0, otherwise it is set to 1. The `for` loop then iterates over the digits '7', '5', and '3' and adds the result of the `aaa` method called with the current digit to the `ans` variable. Finally, the `ans` variable is returned.
