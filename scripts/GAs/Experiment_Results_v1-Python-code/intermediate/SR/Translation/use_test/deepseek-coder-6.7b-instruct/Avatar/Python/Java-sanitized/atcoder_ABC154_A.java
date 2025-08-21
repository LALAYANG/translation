import java.util.*;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        int checkOne = 811;
        int checkTwo = 454;
        if ((checkOne & checkTwo) != 0) {
            if (S.equals(U)) {
                A--;
            }
            if (T.equals(U)) {
                B--;
            }
        }
        System.out.println(A + " " + B);
    }
}