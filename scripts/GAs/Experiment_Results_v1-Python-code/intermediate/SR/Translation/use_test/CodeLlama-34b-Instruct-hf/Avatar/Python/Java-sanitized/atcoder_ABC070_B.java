import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionCheckerThree = 858;
        int conditionCheckerFive = 55;
        int binaryConditionCheckerTwo = 701;
        int binaryConditionCheckerFour = 632;
        int binaryConditionCheckerOne = 505;
        int binaryConditionCheckerSix = 257;
        int[] inputNumbers = new int[4];
        for (int i = 0; i < 4; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        if ((conditionCheckerThree & conditionCheckerFive) != 0) {
            if ((binaryConditionCheckerTwo & binaryConditionCheckerFour) != 0) {
                if ((binaryConditionCheckerOne & binaryConditionCheckerSix) != 0) {
                    if (inputNumbers[1] <= inputNumbers[2] || inputNumbers[3] <= inputNumbers[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(inputNumbers);
                        System.out.println(inputNumbers[2] - inputNumbers[1]);
                    }
                }
            }
        }
    }
}