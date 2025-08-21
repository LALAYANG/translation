import java.util.*;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String targetString = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
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
            }
            if (targetString.equals(U)) {
                B--;
            }
            System.out.println(A + " " + B);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}