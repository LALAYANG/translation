import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int conditionCheckerThree = 858;
        int conditionCheckerFive = 55;
        int binaryConditionCheckerTwo = 701;
        int binaryConditionCheckerFour = 632;
        int binaryConditionCheckerOne = 505;
        int binaryConditionCheckerSix = 257;

        List<Integer> inputNumbers = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());

        if (conditionCheckerThree & conditionCheckerFive) {
            if (binaryConditionCheckerTwo & binaryConditionCheckerFour) {
                if (binaryConditionCheckerOne & binaryConditionCheckerSix) {
                    if (inputNumbers.get(1) <= inputNumbers.get(2) || inputNumbers.get(3) <= inputNumbers.get(0)) {
                        System.out.println(0);
                    } else {
                        inputNumbers.sort(Integer::compareTo);
                        System.out.println(inputNumbers.get(2) - inputNumbers.get(1));
                    }
                }
            }
        }
    }
}