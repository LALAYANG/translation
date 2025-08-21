```
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String myStr = "";
        int firstConditionChecker = 567;
        int secondConditionChecker = 817;
        int fourthConditionChecker = 129;
        int thirdConditionChecker = 723;
        int firstLoopChecker = 302;
        int secondLoopChecker = 301;

        for (int loopIndexOut = 0; loopIndexOut < firstLoopChecker / secondLoopChecker; loopIndexOut++) {
            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (fourthConditionChecker & thirdConditionChecker) {
                    if (firstConditionChecker & secondConditionChecker) {
                        if (c == '0' || c == '1') {
                            myStr += c;
                        } else if (c == 'B' && myStr.length() != 0) {
                            myStr = myStr.substring(0, myStr.length() - 1);
                        }
                    }
                }
            }
        }

        System.out.println(myStr);
    }
}
```
Note: The `ttest_ind` function from the `scipy.stats` library is not available in Java, so it has been removed from the code.
