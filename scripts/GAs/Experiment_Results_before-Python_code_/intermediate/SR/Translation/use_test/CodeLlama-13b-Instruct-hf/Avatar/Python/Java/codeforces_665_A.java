```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int b = sc.nextInt();
        int bt = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```
This code first prompts the user to enter the values of `a`, `at`, `b`, `bt`, `t1`, and `t2` separated by spaces. It then calculates the value of `st` and `fin` based on the input values.

The code then initializes a variable `now` to 0 and a variable `ans` to 0. It then enters a loop that runs while `now` is less than `fin` and `now` is less than 1140.

Inside the loop, the code checks if `now + bt` is greater than `st`. If it is, it increments the value of `ans` by 1. It then adds the value of `b` to `now`.

After the loop, the code prints the value of `ans` to the console.
