import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int ans = 1, CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            String s = sc.nextLine();
            String Period = ".";
            s = s.trim() + Period;
            int L = s.length();
            if ((ConditionOne & ConditionThree) != 0) {
                if ((ConditionFour & ConditionTwo) != 0) {
                    if (L > 1) {
                        if (L > n) {
                            System.out.println("Impossible");
                            System.exit(0);
                        }
                        if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                            ans++;
                            CurrentLineLength = L;
                        } else {
                            CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}