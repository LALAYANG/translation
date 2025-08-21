import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int ThirdChecker = 577;
        int FourthChecker = 673;
        int SecondChecker = 106;
        int FirstChecker = 330;

        Scanner scanner = new Scanner(System.in);
        String UserDecision = scanner.nextLine();
        List<String> DecisionOptions = Arrays.asList("10", "100", "1000", "10000", "100000");

        Collections.shuffle(DecisionOptions);

        List<Integer> UserDecisionList = Arrays.stream(UserDecision.split("")).map(Integer::parseInt).collect(Collectors.toList());
        int newSum = UserDecisionList.stream().mapToInt(Integer::intValue).sum();

        if ((ThirdChecker != 0) && (FourthChecker != 0)) {
            if ((SecondChecker != 0) && (FirstChecker != 0)) {
                if (DecisionOptions.contains(UserDecision)) {
                    System.out.println(10);
                } else {
                    System.out.println(newSum);
                }
            }
        }
    }
}