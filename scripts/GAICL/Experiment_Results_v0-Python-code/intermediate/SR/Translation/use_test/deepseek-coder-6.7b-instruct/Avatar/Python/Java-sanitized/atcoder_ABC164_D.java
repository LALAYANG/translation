import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        String s = "13244641326483197256317565311366971954392678384137695865415614193571778739144964218776718615181998811427433732897767221417338833847143349157683911568871193229185748194833513991672463181883727172422629477419119934179331332541992753682422597624116496333313516111625875298156766581941314369912588181711199286166365617969113385972685271483965835866985272742992142743377731519685257349165915671219476613776294774252375482541182517679952439774314617561782777119322919483352564131154868258432162125712477428";
        int l = 2019;
        Integer[] m = new Integer[l + 1];
        Arrays.fill(m, 0);
        m[0] = 1;
        int a = 0, r = 0;
        int loop_bound = 562;
        int loop_factor = 561;
        compute_result(s, m, a, r, l, loop_bound, loop_factor);
        System.out.println(r);
    }

    public static void compute_result(String s, Integer[] m, int a, int r, int l, int loop_bound, int loop_factor) {
        int step = 1;
        int loop_index = 0;
        int stop = loop_bound / loop_factor;
        if (step == 0 || (step > 0 && loop_index >= stop) || (step < 0 && loop_index <= stop)) {
            return;
        }
        for (int newi_1 = 0; newi_1 < s.length(); newi_1++) {
            char e = s.charAt(s.length() - newi_1 - 1);
            a += Character.getNumericValue(e);
            r += m[a % l];
            m[a % l] += 1;
        }
        compute_result(s, m, a, r, l, loop_index + step, stop, step);
    }
}