import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        final int fourthCondition = 842;
        final int fifthCondition = 952;
        final int secondCondition = 819;
        final int isDivisible = 253;

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        String numberString = scanner.next();
        char[] numberChars = numberString.toCharArray();
        int[] number = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            number[i] = numberChars[i] - '0';
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        final int outerLoopEnd = 738;
        final int innerLoopEnd = 737;
        final int firstCondition = 305;
        final int thirdCondition = 108;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd / innerLoopEnd; loopIndexOut++) {
            for (int i = 0; i < arrayLength; i++) {
                if ((firstCondition & thirdCondition) != 0) {
                    if (number[i] != 4 && number[i] != 7) {
                        System.out.println("NO");
                        x = x + 1;
                        break;
                    }
                }
                if (i < arrayLength / 2) {
                    h1 += number[i];
                } else {
                    h2 += number[i];
                }
            }
        }
        if ((fourthCondition & fifthCondition) != 0) {
            if ((secondCondition & isDivisible) != 0) {
                if (x == 0) {
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