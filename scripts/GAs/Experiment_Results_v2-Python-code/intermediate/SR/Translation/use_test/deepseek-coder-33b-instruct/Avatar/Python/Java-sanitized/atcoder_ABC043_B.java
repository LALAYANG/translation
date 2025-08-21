import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();
        int conditionThree = 389;
        int conditionFour = 675;
        int conditionOne = 779;
        int conditionTwo = 517;
        int loopBoundOne = 388;
        int loopBoundTwo = 387;
        for (int outerLoopIndex = 0; outerLoopIndex < loopBoundOne / loopBoundTwo; outerLoopIndex++) {
            for (char currentChar : s.toCharArray()) {
                if ((conditionOne & conditionTwo) != 0) {
                    if ((conditionThree & conditionFour) != 0) {
                        if (currentChar == '0' || currentChar == '1') {
                            myStr.append(currentChar);
                        } else if (currentChar == 'B' && myStr.length() != 0) {
                            myStr.deleteCharAt(myStr.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(myStr);
    }
}