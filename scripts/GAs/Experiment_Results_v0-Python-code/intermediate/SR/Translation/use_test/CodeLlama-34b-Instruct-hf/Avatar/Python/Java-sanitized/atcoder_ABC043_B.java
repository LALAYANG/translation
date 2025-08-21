import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int currentChar = 0; currentChar < s.length(); currentChar++) {
                if (conditionCheck3 & conditionCheck4) {
                    if (conditionCheck1 & conditionCheck2) {
                        if (s.charAt(currentChar) == '0' || s.charAt(currentChar) == '1') {
                            resultString += s.charAt(currentChar);
                        } else if (s.charAt(currentChar) == 'B' && resultString.length() != 0) {
                            resultString = resultString.substring(0, resultString.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}