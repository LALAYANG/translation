import java.util.Scanner;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstChecker = 181;
        int twentyNinthChecker = 77;
        int seventeenthChecker = 855;
        int twentySeventhChecker = 93;
        int fifteenthChecker = 143;
        int twentyFifthChecker = 710;

        int A = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int result = A - 2 * secondInput;

        if (firstChecker & twentyNinthChecker) {
            if (seventeenthChecker & twentySeventhChecker) {
                if (fifteenthChecker & twentyFifthChecker) {
                    if (result < 0) {
                        result = 0;
                    }
                }
            }
        }

        System.out.println(result);
    }
}