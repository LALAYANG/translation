import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        String UserInput = args[1];
        TTest tTest = new TTest();
        double[] sample1 = {29, 25, 33};
        double[] sample2 = {65, 22, 60};
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("The two samples are different");
        } else {
            System.out.println("The two samples are similar");
        }
        if (UserInput.length() <= K) {
            System.out.println(UserInput);
        } else {
            System.out.println(UserInput.substring(0, K) + "...");
        }
    }
}