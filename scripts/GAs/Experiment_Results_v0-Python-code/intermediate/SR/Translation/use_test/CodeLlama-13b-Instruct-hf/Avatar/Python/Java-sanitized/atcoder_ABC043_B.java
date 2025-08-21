import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String resultString = "";
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;

        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (conditionCheck3 & conditionCheck4) {
                    if (conditionCheck1 & conditionCheck2) {
                        if (s.charAt(j) == '0' || s.charAt(j) == '1') {
                            resultString += s.charAt(j);
                        } else if (s.charAt(j) == 'B' && resultString.length() != 0) {
                            resultString = resultString.substring(0, resultString.length() - 1);
                        }
                    }
                }
            }
        }

        System.out.println(resultString);
    }
}