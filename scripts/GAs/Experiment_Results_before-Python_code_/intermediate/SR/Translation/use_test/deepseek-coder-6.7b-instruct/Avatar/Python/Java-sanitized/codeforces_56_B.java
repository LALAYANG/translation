import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if ((i + 1) != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] B = Arrays.copyOfRange(A, 0, mn);
            int[] C = Arrays.copyOfRange(A, mn, mx + 1);
            int[] D = Arrays.copyOfRange(A, mx + 1, N);
            int[] E = new int[C.length];
            for (int i = 0; i < C.length; i++) {
                E[i] = C[C.length - 1 - i];
            }
            A = new int[N];
            System.arraycopy(B, 0, A, 0, B.length);
            System.arraycopy(E, 0, A, B.length, E.length);
            System.arraycopy(D, 0, A, B.length + E.length, D.length);
            boolean sorted = true;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}