import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        int outerCheckOne = 932;
        int outerCheckTwo = 826;
        int innerConditionOne = 549;
        int innerConditionThree = 93;
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0;
        int h2 = 0;
        boolean exitFlag = false;
        int outerLoopBound = 519;
        int innerLoopBound = 518;
        int innerConditionOne_ = 410;
        int innerConditionTwo = 312;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < inputLength; i++) {
                if (innerConditionOne_ % innerConditionTwo == 0) {
                    if (number.charAt(i) != '4' && number.charAt(i) != '7') {
                        System.out.println("NO");
                        exitFlag = true;
                        break;
                    }
                }
                if (i < inputLength / 2) {
                    h1 += Character.getNumericValue(number.charAt(i));
                } else {
                    h2 += Character.getNumericValue(number.charAt(i));
                }
            }
        }
        if (outerCheckOne % outerCheckTwo == 0) {
            if (innerConditionOne % innerConditionThree == 0) {
                if (!exitFlag) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}