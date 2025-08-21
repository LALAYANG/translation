import java.util.Arrays;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int ThirdChecker = 577;
        int FourthChecker = 673;
        int SecondChecker = 106;
        int FirstChecker = 330;

        // t-test for independent samples
        // ttest_ind([57, 99, 63], [30, 6, 15])

        // shuffle([8, 87, 63])

        // Input from user
        String UserDecision = "1010";
        String[] DecisionOptions = {"10", "100", "1000", "10000", "100000"};

        // Sum of digits in UserDecision
        int newSum = Arrays.stream(UserDecision.split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        // Conditional statements
        if ((ThirdChecker & FourthChecker) != 0 && (SecondChecker & FirstChecker) != 0) {
            if (Arrays.asList(DecisionOptions).contains(UserDecision)) {
                System.out.println(10);
            } else {
                System.out.println(newSum);
            }
        }
    }
}