
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < String.valueOf(curr).length(); k++) {
                    rev += (9 - Integer.parseInt(String.valueOf(curr).charAt(k))) + "";
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```
Note that the code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of 10. The `String.valueOf()` method is used to convert the integer `curr` to a string, and the `charAt()` method is used to access the individual characters of the string. The `Integer.parseInt()` method is used to convert the string back to an integer.
