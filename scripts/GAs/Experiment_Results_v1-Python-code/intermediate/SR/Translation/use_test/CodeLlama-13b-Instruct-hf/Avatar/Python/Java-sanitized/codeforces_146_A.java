import java.util.Scanner;

public class codeforces_146_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] number = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            number[i] = scanner.nextInt();
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        int outerLoopEnd = 738;
        int innerLoopEnd = 737;
        int firstCondition = 305;
        int thirdCondition = 108;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / innerLoopEnd; LoopIndexOut++) {
            for (int i = 0; i < arrayLength; i++) {
                if (firstCondition & thirdCondition) {
                    if (number[i] != 4 && number[i] != 7) {
                        System.out.println("NO");
                        x++;
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
        if (fourthCondition & fifthCondition) {
            if (secondCondition & isDivisible) {
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