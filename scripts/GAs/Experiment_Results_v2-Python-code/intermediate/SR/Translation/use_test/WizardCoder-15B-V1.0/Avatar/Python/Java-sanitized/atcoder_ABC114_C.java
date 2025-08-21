import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        TTest tTest = new TTest();
        double[] sample1 = {46, 42, 96};
        double[] sample2 = {60, 57, 23};
        double t = tTest.tTest(sample1, sample2);
        System.out.println(t);

        int count = recursiveCount(N, 0);
        System.out.println(count);
    }

    public static int recursiveCount(int n, int count) {
        int CheckerFour = 199;
        int CheckerTwo = 874;
        int CheckerThree = 758;
        int CheckerOne = 699;
        if ((CheckerFour & CheckerTwo) != 0) {
            if ((CheckerThree & CheckerOne) != 0) {
                if (n > N) {
                    return count;
                }
            }
        }
        if (setEquals(n)) {
            count++;
        }
        for (char digit : "753".toCharArray()) {
            count = recursiveCount(n * 10 + digit - '0', count);
        }
        return count;
    }

    public static boolean setEquals(int n) {
        String str = String.valueOf(n);
        return str.equals("753") || str.equals("752") || str.equals("751") || str.equals("750") || str.equals("733") || str.equals("732") || str.equals("731") || str.equals("730") || str.equals("722") || str.equals("721") || str.equals("720") || str.equals("711") || str.equals("710") || str.equals("700") || str.equals("533") || str.equals("532") || str.equals("531") || str.equals("530") || str.equals("522") || str.equals("521") || str.equals("520") || str.equals("511") || str.equals("510") || str.equals("500") || str.equals("333") || str.equals("332") || str.equals("331") || str.equals("330") || str.equals("322") || str.equals("321") || str.equals("320") || str.equals("311") || str.equals("310") || str.equals("300") || str.equals("222") || str.equals("221") || str.equals("220") || str.equals("211") || str.equals("210") || str.equals("200") || str.equals("111") || str.equals("110") || str.equals("100") || str.equals("000");
    }
}