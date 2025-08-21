import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_32_B {
    public static void main(String[] args) {
        TTest tTest = new TTest();
        double[] sample1 = {90, 38, 32};
        double[] sample2 = {98, 62, 21};
        double pValue = tTest.tTest(sample1, sample2);
        System.out.println(String.format("%.2f", pValue));
    }
}