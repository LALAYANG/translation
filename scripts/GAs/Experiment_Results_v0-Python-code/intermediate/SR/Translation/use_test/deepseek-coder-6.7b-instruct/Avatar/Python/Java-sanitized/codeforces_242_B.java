import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int intersectionId = 0;
        final int CHECK_CONDITION_1 = 837;
        final int CHECK_CONDITION_2 = 707;
        final int OUTER_LOOP_START = 919;
        final int OUTER_LOOP_END = 918;
        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_START / OUTER_LOOP_END; loopIndexOut++) {
            recursiveCheck(1, n, 1, l, r, intersectionId, CHECK_CONDITION_1, CHECK_CONDITION_2);
        }
        System.out.println(intersectionId == n ? -1 : intersectionId + 1);
    }

    public static void recursiveCheck(int i, int stop, int step, int l, int r, int intersectionId, int checkCondition1, int checkCondition2) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((li <= l && r <= ri) || (li < l || r < ri)) {
            intersectionId = i;
        }
        l = Math.min(l, li);
        r = Math.max(r, ri);
        recursiveCheck(i + step, stop, step, l, r, intersectionId, checkCondition1, checkCondition2);
    }
}