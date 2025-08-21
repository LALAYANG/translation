import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        double[] sample1 = {54, 70, 29};
        double[] sample2 = {3, 84, 21};
        TTest ttest = new TTest();
        double pValue = ttest.tTest(sample1, sample2);
        System.out.println(pValue);
    }
}