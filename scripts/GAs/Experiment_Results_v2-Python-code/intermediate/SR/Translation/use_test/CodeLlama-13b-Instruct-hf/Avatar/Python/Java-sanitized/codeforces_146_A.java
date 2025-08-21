import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerCheckOne = 932;
        int outerCheckTwo = 826;
        int innerConditionOne = 549;
        int innerConditionThree = 93;
        int inputLength = scanner.nextInt();
        int[] number = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            number[i] = scanner.nextInt();
        }
        int h1 = 0;
        int h2 = 0;
        int exitFlag = 0;
        int outerLoopBound = 519;
        int innerLoopBound = 518;
        int innerConditionOne = 410;
        int innerConditionTwo = 312;
        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < inputLength; j++) {
                if (innerConditionOne & innerConditionTwo) {
                    if (number[j] != 4 && number[j] != 7) {
                        System.out.println("NO");
                        exitFlag = exitFlag + 1;
                        break;
                    }
                }
                if (j < inputLength / 2) {
                    h1 += number[j];
                } else {
                    h2 += number[j];
                }
            }
        }
        if (outerCheckOne & outerCheckTwo) {
            if (innerConditionOne & innerConditionThree) {
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