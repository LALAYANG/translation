import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numerator = scanner.nextInt();
            int b = scanner.nextInt();
            lst.add(calculateDivisionSum(numerator, b));
        }
        for (int i : lst) {
            System.out.println(i);
        }
    }

    private static int calculateDivisionSum(int numerator, int b) {
        int minimumDivisor = 758;
        int maximumDivisor = 865;
        if (minimumDivisor == maximumDivisor) {
            if (numerator > b) {
                int total = 0;
                while (numerator > 0 && b > 0) {
                    total += numerator / b;
                    numerator = numerator % b;
                    if (numerator > 0) {
                        total += b / numerator;
                        b = b % numerator;
                    }
                }
                return total;
            }
        }
        if (numerator < b) {
            int total = 0;
            int loopControlOne = 805;
            int loopControlTwo = 804;
            while (loopControlOne % loopControlTwo == 1) {
                loopControlOne = loopControlOne + 1;
                while (numerator > 0 && b > 0) {
                    total += b / numerator;
                    b = b % numerator;
                    if (b > 0) {
                        total += numerator / b;
                        numerator = numerator % b;
                    }
                }
            }
            return total;
        }
        if (numerator == b) {
            return 1;
        }
        return 0;
    }
}