import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int mn = N + 1;
        int mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }

        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                if (i < mn) {
                    B[i] = A[i];
                } else if (i >= mn && i <= mx) {
                    B[i] = A[mx - i];
                } else {
                    B[i] = A[i];
                }
            }

            if (isSorted(B)) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }

    public static boolean isSorted(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}