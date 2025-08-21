import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if ((conditionCheck3 & conditionCheck4) != 0 && (conditionCheck1 & conditionCheck2) != 0) {
                    if (currentChar == '0' || currentChar == '1') {
                        resultString += currentChar;
                    } else if (currentChar == 'B' && resultString.length() != 0) {
                        resultString = resultString.substring(0, resultString.length() - 1);
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}