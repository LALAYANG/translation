import java.util.*;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        double[] numbers = new double[splitInput.length];
        for (int i = 0; i < splitInput.length; i++) {
            numbers[i] = Double.parseDouble(splitInput[i]);
        }
        TTest tTest = new TTest();
        double[] sample1 = {33, 31, 86};
        double[] sample2 = {14, 36, 26};
        double tStatistic = tTest.tTest(StatUtils.add(sample1, sample2), sample1, sample2);
        System.out.println(tStatistic);
        input = scanner.nextLine();
        int count = input.length() - input.replace("0", "").length();
        System.out.println(count == 0 ? 0 : StatUtils.product(numbers));
    }
}