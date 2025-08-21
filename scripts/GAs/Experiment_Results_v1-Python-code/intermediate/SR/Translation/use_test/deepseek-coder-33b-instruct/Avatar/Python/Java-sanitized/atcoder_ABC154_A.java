import java.util.Scanner;

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
        try {
            int check_one = 811;
            int check_two = 454;
            if ((check_one & check_two) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (T.equals(U)) {
                B -= 1;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            // Do nothing
        }
    }
}