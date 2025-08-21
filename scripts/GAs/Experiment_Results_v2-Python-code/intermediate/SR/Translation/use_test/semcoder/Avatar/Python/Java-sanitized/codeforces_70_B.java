// Java solution to process input sentences and output the number of lines required
import java.util.Scanner;

public class codeforces_70_B {
    public static String StringProcessor(String s, String Period) {
        return s.strip() + Period;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1, CurrentLineLength = 0;
        int ConditionFour = 805, ConditionTwo = 538, ConditionOne = 447, ConditionThree = 671;
        int OuterLoopLimit = 388, InnerLoopLimit = 387;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            String s = scanner.nextLine();
            String[] sentences = s.split("[.?!]");

            for (String sentence : sentences) {
                String Period = ".";
                String ProcessedSentence = StringProcessor(sentence, Period);
                int L = ProcessedSentence.length();

                if (ConditionOne & ConditionThree) {
                    if (ConditionFour & ConditionTwo) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                                ans++;
                                CurrentLineLength = L;
                            } else {
                                CurrentLineLength += L + (CurrentLineLength > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}