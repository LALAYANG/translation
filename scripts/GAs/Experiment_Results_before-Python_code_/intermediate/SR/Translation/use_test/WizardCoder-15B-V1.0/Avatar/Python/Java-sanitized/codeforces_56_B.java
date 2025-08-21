import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A.get(i)) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            List<Integer> B = new ArrayList<>();
            for (int i = mn; i <= mx; i++) {
                B.add(A.get(i));
            }
            Collections.reverse(B);
            A.removeAll(B);
            if (A.equals(Collections.nCopies(N, 1))) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }
}