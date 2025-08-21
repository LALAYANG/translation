import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int conditionCheckerThree = 858;
        int conditionCheckerFive = 55;
        int binaryConditionCheckerTwo = 701;
        int binaryConditionCheckerFour = 632;
        int binaryConditionCheckerOne = 505;
        int binaryConditionCheckerSix = 257;
        List<Integer> inputNumbers = new ArrayList<>(Arrays.asList(88, 43, 4));
        Collections.shuffle(inputNumbers);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            inputNumbers.add(scanner.nextInt());
        }
        if ((conditionCheckerThree & conditionCheckerFive) != 0) {
            if ((binaryConditionCheckerTwo & binaryConditionCheckerFour) != 0) {
                if ((binaryConditionCheckerOne & binaryConditionCheckerSix) != 0) {
                    if (inputNumbers.get(1) <= inputNumbers.get(2) || inputNumbers.get(3) <= inputNumbers.get(0)) {
                        System.out.println(0);
                    } else {
                        Collections.sort(inputNumbers);
                        System.out.println(inputNumbers.get(2) - inputNumbers.get(1));
                    }
                }
            }
        }
    }
}