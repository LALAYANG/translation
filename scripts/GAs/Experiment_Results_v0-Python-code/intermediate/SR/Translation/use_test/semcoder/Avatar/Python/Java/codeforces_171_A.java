Thought process:
1. Read input strings `a` and `b`.
2. Pad strings with zeros to make them of equal length.
3. Create a loop to iterate over each digit and add them together.
4. Handle carry over and update the sum string accordingly.
5. Print the final sum after handling any remaining carry.

```java
import java.util.Scanner;

public class AddLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = a.length() < x ? a.concat("0".repeat(x - a.length())) : a;
        b = b.length() < x ? b.concat("0".repeat(x - b.length())) : b;
        String sum_str = "";
        int carry = 0;

        for (int i = 0; i < x; i++) {
            int digit_a = Integer.parseInt(String.valueOf(a.charAt(x - i - 1)));
            int digit_b = Integer.parseInt(String.valueOf(b.charAt(i)));
            int sum = digit_a + digit_b + carry;
            if (sum > 9) {
                sum_str = String.valueOf(sum).charAt(1) + sum_str;
                carry = 1;
            } else {
                sum_str = String.valueOf(sum) + sum_str;
                carry = 0;
            }
        }
        if (carry == 1) {
            sum_str = "1" + sum_str;
        }
        System.out.println(Integer.parseInt(sum_str));
    }
}
```
