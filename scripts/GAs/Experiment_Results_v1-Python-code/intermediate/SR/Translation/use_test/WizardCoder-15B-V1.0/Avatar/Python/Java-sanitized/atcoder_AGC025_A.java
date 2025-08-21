import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionOne = 319;
        int conditionSix = 353;
        int conditionTwo = 400;
        int conditionFive = 725;
        int conditionThree = 204;
        int conditionFour = 645;
        double[] sampleOne = {33, 6, 81};
        double[] sampleTwo = {49, 45, 51};
        TTest tTest = new TTest();
        double t = tTest.tTest(sampleOne, sampleTwo);
        System.out.println(t);
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(new double[]{10, 100, 1000, 10000, 100000});
        System.out.println(descriptiveStatistics.getMean());
        String userInput = scanner.nextLine();
        String[] presetValues = {"10", "100", "1000", "10000", "100000"};
        int[] userInputArray = new int[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            userInputArray[i] = Integer.parseInt(userInput.charAt(i) + "");
        }
        int new = 0;
        for (int i = 0; i < userInputArray.length; i++) {
            new += userInputArray[i];
        }
        if (conditionOne == 319 && conditionSix == 353) {
            if (conditionTwo == 400 && conditionFive == 725) {
                if (conditionThree == 204 && conditionFour == 645) {
                    if (Arrays.asList(presetValues).contains(userInput)) {
                        System.out.println(10);
                    } else {
                        System.out.println(new);
                    }
                }
            }
        }
    }
}