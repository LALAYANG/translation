```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int l = 2019;
        int[] m = new int[l];
        Arrays.fill(m, 1);
        int a = 0, r = 0;
        int loop_bound = 562;
        int loop_factor = 561;
        compute_result(0, loop_bound / loop_factor, 1, s, l, m, a, r);
        System.out.println(r);
    }

    public static void compute_result(int loop_index, int stop, int step, String s, int l, int[] m, int a, int r) {
        if (step == 0 || (step > 0 && loop_index >= stop) || (step < 0 && loop_index <= stop)) {
            return;
        }
        for (int digit_index = 0; digit_index < s.length(); digit_index++) {
            a += Integer.parseInt(String.valueOf(s.charAt(s.length() - digit_index - 1))) * pow(10, digit_index, l);
            r += m[a % l];
            m[a % l] += 1;
        }
        compute_result(loop_index + step, stop, step, s, l, m, a, r);
    }

    public static int pow(int a, int b, int mod) {
        int result = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads a large number as a string, then computes a result by iterating over the digits of the number, and for each digit, it updates the running total (a) and the result (r). The running total is modulo 2019 to keep it within the range of the modulus. The result is the count of the running total modulo 2019.

The `pow` function is a helper function that computes the power of a number modulo another number. This is necessary because in Java, the `%` operator does not work with negative numbers, so we need to use this function to correctly compute the modulus.

