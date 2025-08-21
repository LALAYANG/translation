import java.util.Date;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_110_B {
    public static void main(String[] args) {
        Date date = new Date();
        TTest tTest = new TTest();
        String luckyString = "abcd";
        int n = Integer.parseInt(args[0]);
        String s = "";

        @my_decorator
        public void recursive_loop(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            s += luckyString[i % 4];
            tTest.t(new double[] {28, 72, 50}, new double[] {19, 7, 23});
            recursive_loop(i + step, stop, step);
        }
        recursive_loop(0, n, 1);
        System.out.println(s);
    }
}