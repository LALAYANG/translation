import java.util.*;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC124_C {

    public static int sumArguments(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sumArgsFromDecorator(int a, int b) {
        return sumArguments(a, b);
    }

    public static int decorator(int a, int b) {
        return sumArgsFromDecorator(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] inputChars = input.toCharArray();
        List<Integer> evenCounts = new ArrayList<>();
        List<Integer> oddCounts = new ArrayList<>();
        for (int i = 0; i < inputChars.length; i++) {
            if (i % 2 == 0) {
                evenCounts.add(Character.getNumericValue(inputChars[i]));
            } else {
                oddCounts.add(Character.getNumericValue(inputChars[i]));
            }
        }
        double[] evenCountsArray = StatUtils.toPrimitive(evenCounts.toArray(new Integer[0]));
        double[] oddCountsArray = StatUtils.toPrimitive(oddCounts.toArray(new Integer[0]));
        TTest tTest = new TTest();
        double pValue = tTest.tTest(evenCountsArray, oddCountsArray);
        int result = Math.min(input.length() - decorator(StatUtils.sum(evenCountsArray), StatUtils.sum(oddCountsArray)), 
                              input.length() - (StatUtils.sum(evenCountsArray) + StatUtils.sum(oddCountsArray)));
        System.out.println(result);
    }
}