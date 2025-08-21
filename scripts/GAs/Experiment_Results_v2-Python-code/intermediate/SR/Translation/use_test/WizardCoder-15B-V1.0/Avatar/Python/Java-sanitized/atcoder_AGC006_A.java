import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String t = args[2];
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{96, 43, 37}, new double[]{92, 45, 40});
        if (pValue < 0.05) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        counter = n - i;
                    }
                }
            }
            System.out.println(2 * n - counter);
        } else {
            System.out.println(n);
        }
    }
}