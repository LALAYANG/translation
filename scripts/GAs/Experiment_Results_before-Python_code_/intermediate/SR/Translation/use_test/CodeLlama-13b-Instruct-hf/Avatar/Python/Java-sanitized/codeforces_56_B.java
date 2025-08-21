import java.util.Scanner;

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
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            A = A[0..mn] + A[mn..(mx + 1)][::-1] + A[(mx + 1)..];
            if (java.util.Arrays.equals(A, java.util.Arrays.sort(A))) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }
}