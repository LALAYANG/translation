```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = a.replaceAll("^0*", "");
        b = b.replaceAll("^0*", "");
        if (a.length() < x) {
            a = "0" + a;
        }
        if (b.length() < x) {
            b = "0" + b;
        }
        String sum_str = "";
        int carry = 0;
        for (int i = 0; i < x; i++) {
            int variable_9_13 = Character.getNumericValue(b.charAt(i));
            int variable_11_13 = Character.getNumericValue(a.charAt(x - i - 1));
            int result_add_digits0 = add_digits(variable_9_13, variable_11_13, carry);
            if (result_add_digits0 > 9) {
                sum_str += result_add_digits0 - 10;
                carry = 1;
            } else {
                sum_str += result_add_digits0;
                carry = 0;
            }
        }
        if (carry == 1) {
            sum_str += 1;
        }
        System.out.println(sum_str);
    }

    public static int add_digits(int variable_9_13, int variable_11_13, int carry) {
        return variable_9_13 + variable_11_13 + carry;
    }
}
```
