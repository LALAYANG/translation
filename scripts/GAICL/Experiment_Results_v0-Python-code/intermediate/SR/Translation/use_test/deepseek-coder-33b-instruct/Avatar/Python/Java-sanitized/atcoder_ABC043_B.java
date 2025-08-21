import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder resultString = new StringBuilder();
        int conditionCheck1 = 909;
        int conditionCheck2 = 642;
        int conditionCheck3 = 112;
        int conditionCheck4 = 209;
        int outerLoopLimit = 108;
        int innerLoopLimit = 107;
        List<Integer> list1 = new ArrayList<>(Arrays.asList(93, 25, 15));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(54, 96, 81));
        Collections.shuffle(list1);
        Collections.shuffle(list2);

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (char currentChar : s.toCharArray()) {
                if ((conditionCheck3 & conditionCheck4) != 0) {
                    if ((conditionCheck1 & conditionCheck2) != 0) {
                        if (currentChar == '0' || currentChar == '1') {
                            resultString.append(currentChar);
                        } else if (currentChar == 'B' && resultString.length() != 0) {
                            resultString.deleteCharAt(resultString.length() - 1);
                        }
                    }
                }
            }
        }

        System.out.println(resultString);
    }
}