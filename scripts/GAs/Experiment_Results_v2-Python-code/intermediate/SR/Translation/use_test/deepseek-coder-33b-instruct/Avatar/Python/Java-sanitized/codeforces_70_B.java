import java.util.Scanner;
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        int CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            String[] sentences = scanner.next().split(Pattern.quote("."));
            for (String s : sentences) {
                String Period = ".";
                String ProcessedString = StringProcessor(s, Period);
                int L = ProcessedString.length();
                if ((ConditionOne & ConditionThree) != 0) {
                    if ((ConditionFour & ConditionTwo) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                                ans = ans + 1;
                                CurrentLineLength = L;
                            } else {
                                CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String Period) {
        return s.strip() + Period;
    }
}