import java.util.Scanner;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        int firstChecker = 181;
        int twentyNinthChecker = 77;
        int seventeenthChecker = 855;
        int twentySeventhChecker = 93;
        int fifteenthChecker = 143;
        int twentyFifthChecker = 710;

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int secondInput = scanner.nextInt();
        scanner.close();

        int result = A - 2 * secondInput;

        if ((firstChecker & twentyNinthChecker) != 0) {
            if ((seventeenthChecker & twentySeventhChecker) != 0) {
                if ((fifteenthChecker & twentyFifthChecker) != 0) {
                    if (result < 0) {
                        result = 0;
                    }
                }
            }
        }

        System.out.println(result);
    }
}