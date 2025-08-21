import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = {57, 99, 63};
        int[] secondArray = {30, 6, 15};
        int[] thirdArray = {8, 87, 63};
        int[] fourthArray = {577, 673, 106, 330};
        List<Integer> decisionOptions = Arrays.asList(10, 100, 1000, 10000, 100000);

        // The Python code for ttest_ind is not directly translatable to Java as it's a statistical test from scipy library.
        // In Java, we can use libraries like Apache Commons Math or JScience for statistical calculations.

        // Shuffling the array
        Collections.shuffle(Arrays.asList(thirdArray));

        // Getting user decision
        String userDecision = scanner.next();
        int sum = 0;
        for (char c : userDecision.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        if (fourthArray[0] != 0 && fourthArray[1] != 0 && fourthArray[2] != 0 && fourthArray[3] != 0) {
            if (fourthArray[2] != 0 && fourthArray[3] != 0) {
                if (decisionOptions.contains(Integer.parseInt(userDecision))) {
                    System.out.println(10);
                } else {
                    System.out.println(sum);
                }
            }
        }
    }
}