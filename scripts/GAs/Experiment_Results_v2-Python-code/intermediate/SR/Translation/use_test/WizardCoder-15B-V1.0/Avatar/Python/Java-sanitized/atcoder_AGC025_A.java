import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int ThirdChecker = 577;
        int FourthChecker = 673;
        int SecondChecker = 106;
        int FirstChecker = 330;
        double[] sample1 = {57, 99, 63};
        double[] sample2 = {30, 6, 15};
        double t, p;
        t = ttest_ind(sample1, sample2)[0];
        p = ttest_ind(sample1, sample2)[1];
        System.out.println("t-value: " + t);
        System.out.println("p-value: " + p);

        List<Integer> UserDecision = Arrays.asList(2, 5, 8, 10);
        List<String> DecisionOptions = Arrays.asList("10", "100", "1000", "10000", "100000");
        Collections.shuffle(UserDecision);
        int new = UserDecision.stream().mapToInt(Integer::intValue).sum();
        if ((ThirdChecker & FourthChecker) != 0) {
            if ((SecondChecker & FirstChecker) != 0) {
                if (DecisionOptions.contains(String.valueOf(new))) {
                    System.out.println(10);
                } else {
                    System.out.println(new);
                }
            }
        }
    }
}