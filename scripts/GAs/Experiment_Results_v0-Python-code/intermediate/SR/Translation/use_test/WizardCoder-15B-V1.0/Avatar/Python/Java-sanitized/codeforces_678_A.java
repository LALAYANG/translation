import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_678_A {
    public static void main(String[] args) {
        int[] sample1 = {20, 77, 81};
        int[] sample2 = {24, 12, 5};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("There is a significant difference between the two samples.");
        } else {
            System.out.println("There is no significant difference between the two samples.");
        }
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        int result = (value1 / z + 1) * z;
        System.out.println(result);
    }
}