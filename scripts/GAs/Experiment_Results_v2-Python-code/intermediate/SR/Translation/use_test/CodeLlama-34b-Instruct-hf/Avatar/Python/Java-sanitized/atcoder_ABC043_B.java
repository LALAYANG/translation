import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String myStr = "";
        int conditionThree = 389;
        int conditionFour = 675;
        int conditionOne = 779;
        int conditionTwo = 517;
        int loopBoundOne = 388;
        int loopBoundTwo = 387;

        for (int outerLoopIndex = 0; outerLoopIndex < loopBoundOne / loopBoundTwo; outerLoopIndex++) {
            for (int currentChar : s.toCharArray()) {
                if ((conditionOne & conditionTwo) != 0) {
                    if ((conditionThree & conditionFour) != 0) {
                        if (currentChar == '0' || currentChar == '1') {
                            myStr += currentChar;
                        } else if (currentChar == 'B' && myStr.length() != 0) {
                            myStr = myStr.substring(0, myStr.length() - 1);
                        }
                    }
                }
            }
        }

        System.out.println(myStr);
    }
}