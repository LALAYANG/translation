import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC164_D {
    static int a = 0;
    static int r = 0;
    static int[] m = new int[2019];
    static String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";

    public static void main(String[] args) {
        Arrays.fill(m, 0);
        m[0] = 1;
        computeResult(0, 287, 1);
        System.out.println(r);
    }

    public static void computeResult(int loop_index, int stop, int step) {
        if (step == 0 || (step > 0 && loop_index >= stop) || (step < 0 && loop_index <= stop)) {
            return;
        }
        for (int digit_index = 0; digit_index < s.length(); digit_index++) {
            a += Integer.parseInt(String.valueOf(s.charAt(digit_index))) * Math.toIntExact(mod(Math.round(Math.pow(10, digit_index)), 2019));
            r += m[a % 2019];
            m[a % 2019] += 1;
        }
        computeResult(loop_index + step, stop, step);
    }

    public static long mod(double base, long modulus) {
        if (base < 0) {
            base += modulus;
        }
        return (long) (base % modulus);
    }
}