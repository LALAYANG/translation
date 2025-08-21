import java.util.Random;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_110_B {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        String s = "";
        String lucky_string = "abcd";
        recursiveLoop(0, n, 1, lucky_string, s);
        System.out.println(s);
    }

    @my_decorator
    public static void recursiveLoop(int i, int stop, int step, String lucky_string, String s) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += lucky_string.charAt(moduloOperator(i, 4));
        double[] sample1 = {28, 72, 50};
        double[] sample2 = {19, 7, 23};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        recursiveLoop(i + step, stop, step, lucky_string, s);
    }

    public static int moduloOperator(int a, int b) {
        return a % b;
    }

    public static void my_decorator(Object func) {
        new Random().nextInt(100);
    }
}