import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int mn = N + 1, mx = -1;
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
                B[i] = A[i];
            }
            for (int i = mn, j = mx; i <= j; i++, j--) {
                int temp = B[i];
                B[i] = B[j];
                B[j] = temp;
            }
            boolean sorted = true;
            for (int i = 0; i < N - 1; i++) {
                if (B[i] > B[i + 1]) {
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