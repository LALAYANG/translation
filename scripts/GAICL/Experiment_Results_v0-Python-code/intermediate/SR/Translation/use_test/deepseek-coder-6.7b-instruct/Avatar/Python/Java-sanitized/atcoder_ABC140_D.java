import java.util.*;

class Main {
    static Scanner in = new Scanner(System.in);

    static int calculateHappiness(int variable647, int N, int segCnt) {
        return N - variable647 - segCnt;
    }

    static int decorator(FunctionalInterface func) {
        return func.result();
    }

    @FunctionalInterface
    interface FunctionalInterface {
        int result();
    }

    static String gw() {
        return in.next();
    }

    static int gi() {
        return in.nextInt();
    }

    public static void main(String[] args) {
        int N = gi();
        int maxChanges = gi();
        String S = gw();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }
        int variable647 = 1;
        int curHappy = calculateHappiness(variable647, N, segCnt);
        int ans;
        if (2 * maxChanges >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * maxChanges;
        }
        System.out.println(ans);
    }
}