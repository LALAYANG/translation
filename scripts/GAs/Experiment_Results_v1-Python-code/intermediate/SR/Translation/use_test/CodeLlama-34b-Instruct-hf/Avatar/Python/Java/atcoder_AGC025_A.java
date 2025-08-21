```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionOne = 319;
        int conditionSix = 353;
        int conditionTwo = 400;
        int conditionFive = 725;
        int conditionThree = 204;
        int conditionFour = 645;

        // Get user input
        String userInput = scanner.nextLine();

        // Convert user input to array of integers
        int[] userInputArray = Arrays.stream(userInput.split(",")).mapToInt(Integer::parseInt).toArray();

        // Perform t-test on user input array
        double tTestResult = ttest_ind(userInputArray, [49, 45, 51]);

        // Check if t-test result is significant
        if (tTestResult < 0.05) {
            System.out.println("The difference between the samples is statistically significant.");
        } else {
            System.out.println("The difference between the samples is not statistically significant.");
        }
    }

    // Function to perform t-test on two arrays
    public static double ttest_ind(int[] array1, int[] array2) {
        // Calculate the means of the two arrays
        double mean1 = Arrays.stream(array1).average().getAsDouble();
        double mean2 = Arrays.stream(array2).average().getAsDouble();

        // Calculate the standard deviations of the two arrays
        double stdDev1 = Arrays.stream(array1).map(x -> Math.pow(x - mean1, 2)).sum() / (array1.length - 1);
        double stdDev2 = Arrays.stream(array2).map(x -> Math.pow(x - mean2, 2)).sum() / (array2.length - 1);

        // Calculate the t-statistic
        double tStatistic = (mean1 - mean2) / Math.sqrt((stdDev1 / array1.length) + (stdDev2 / array2.length));

        // Calculate the degrees of freedom
        int degreesOfFreedom = array1.length + array2.length - 2;

        // Calculate the p-value
        double pValue = 2 * (1 - StudentT.cdf(Math.abs(tStatistic), degreesOfFreedom));

        return pValue;
    }
}
```
Note: The `ttest_ind` function is not a built-in function in Java, so you will need to implement it yourself or use a library that provides it. The `StudentT` class is a built-in class in Java that provides methods for calculating Student's t-distribution.
