import java.util.Arrays;
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String sum = "";
        int carry = 0;
        for (int i = 0; i < x; i++) {
            int d = (b.charAt(i) - '0') + (a.charAt(x - i - 1) - '0') + carry;
            if (d > 9) {
                sum = d % 10 + sum;
                carry = 1;
            } else {
                sum = d + sum;
                carry = 0;
            }
        }
        if (carry == 1) {
            sum = "1" + sum;
        }
        System.out.println(sum);
    }
}