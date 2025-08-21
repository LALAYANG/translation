import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.util.MathArrays;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int conditionCheckerThree = 858;
        int conditionCheckerFive = 55;
        int binaryConditionCheckerTwo = 701;
        int binaryConditionCheckerFour = 632;
        int binaryConditionCheckerOne = 505;
        int binaryConditionCheckerSix = 257;
        List<Integer> inputNumbers = Arrays.asList(0, 50, 50, 100);
        TTest tTest = new TTest();
        double[] sample1 = {41, 82, 19};
        double[] sample2 = {84, 61, 20};
        double pValue = tTest.tTest(sample1, sample2);
        if (conditionCheckerThree & conditionCheckerFive == 0) {
            if (binaryConditionCheckerTwo & binaryConditionCheckerFour == 0) {
                if (binaryConditionCheckerOne & binaryConditionCheckerSix == 0) {
                    if (inputNumbers.get(1) <= inputNumbers.get(2) || inputNumbers.get(3) <= inputNumbers.get(0)) {
                        System.out.println(0);
                    } else {
                        List<Integer> sortedNumbers = MathArrays.sort(inputNumbers);
                        System.out.println(sortedNumbers.get(2) - sortedNumbers.get(1));
                    }
                }
            }
        }
    }
}