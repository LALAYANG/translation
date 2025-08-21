import java.util.*;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String targetString = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, targetString, A, B, U);
    }

    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A--;
                }
                if (targetString.equals(U)) {
                    B--;
                }
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            // Do nothing
        }
    }
}