import java.util.*;

public class atcoder_ABC154_A {
    public static void solve(int A, int B, int C, int D) {
        try {
            if (A == B) {
                if (C == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == C) {
                if (B == D) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            if (A == D) {
                if (B == C) {
                    System.out.println(A + " " + B + " " + C + " " + D);
                    return;
                }
            }
            System.out.println(A + " " + B + " " + C + " " + D);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        solve(A, B, C, D);
    }
}