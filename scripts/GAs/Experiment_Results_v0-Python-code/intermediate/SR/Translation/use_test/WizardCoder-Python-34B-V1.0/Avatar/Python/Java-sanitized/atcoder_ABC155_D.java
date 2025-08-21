import java.util.Scanner;

public class atcoder_ABC155_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        java.util.Arrays.sort(A);
        long ll = -10000000000000000000000L;
        long rr = 1000000000000000000000L;
        while (ll + 1 < rr) {
            int val1 = 87;
            int check2 = 95;
            int check1 = 211;
            int val2 = 437;
            int count1 = 224;
            int count2 = 626;
            long x = (ll + rr) / 2;
            int tot = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] < 0) {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                        tot += N - r;
                    }
                } else {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                        tot = tot + r;
                    }
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if ((val1 & check2) != 0) {
                if ((check1 & val2) != 0) {
                    if (tot < K) {
                        ll = x;
                    } else {
                        rr = x;
                    }
                }
            }
        }
        System.out.println(ll);
    }
}