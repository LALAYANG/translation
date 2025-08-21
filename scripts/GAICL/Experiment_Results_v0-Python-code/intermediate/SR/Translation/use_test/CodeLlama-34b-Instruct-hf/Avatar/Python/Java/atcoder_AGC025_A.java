```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NewConditionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threshold1 = 438;
        int threshold2 = 760;
        int newConditionChecker113_1 = 957;
        int conditionChecker213 = 914;
        int newConditionChecker111_1 = 763;
        int conditionChecker211 = 829;
        int conditionChecker19 = 438;
        int newConditionChecker29_1 = 760;
        String[] allowedValues = {"10", "100", "1000", "10000", "100000"};

        // Get user input
        String userInput = scanner.nextLine();

        // Shuffle the input
        int[] shuffledInput = shuffle(userInput);

        // Perform t-test on the shuffled input
        double ttestResult = ttest_ind(shuffledInput, allowedValues);

        // Calculate the sum of the input
        int sum = 0;
        for (int i = 0; i < shuffledInput.length; i++) {
            sum += shuffledInput[i];
        }

        // Check if the sum is within the threshold
        if (sum >= threshold1 && sum <= threshold2) {
            // Check if the input is in the allowed values
            if (Arrays.asList(allowedValues).contains(userInput)) {
                System.out.println(10);
            } else {
                System.out.println(sum);
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    // Shuffle the input
    public static int[] shuffle(String input) {
        int[] shuffledInput = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            shuffledInput[i] = input.charAt(i);
        }
        Random random = new Random();
        for (int i = 0; i < shuffledInput.length; i++) {
            int randomIndex = random.nextInt(shuffledInput.length);
            int temp = shuffledInput[i];
            shuffledInput[i] = shuffledInput[randomIndex];
            shuffledInput[randomIndex] = temp;
        }
        return shuffledInput;
    }

    // Perform t-test on the input
    public static double ttest_ind(int[] input1, String[] input2) {
        double ttestResult = 0;
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                ttestResult += Math.pow(input1[i] - input2[j], 2);
            }
        }
        ttestResult /= (input1.length * input2.length);
        return ttestResult;
    }
}
```
Note: The `ttest_ind` function is not a built-in function in Java, so you will need to implement it yourself or use a library that provides it. The `shuffle` function is also not a built-in function in Java, so you will need to implement it yourself or use a library that provides it.
