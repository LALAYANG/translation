import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int intersectionId = 0;
        for (int loopIndexOut = 0; loopIndexOut < 919 / 918; loopIndexOut++) {
            recursiveCheck(1, n, 1, l, r, intersectionId);
        }
        System.out.println(intersectionId == n ? -1 : intersectionId + 1);
    }

    public static void recursiveCheck(int i, int stop, int step, int l, int r, int intersectionId) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int ri = scanner.nextInt();
        if (li <= l && r <= ri) {
            intersectionId = i;
        } else if (li < l || r < ri) {
            intersectionId = n;
        }
        l = Math.min(l, li);
        r = Math.max(r, ri);
        recursiveCheck(i + step, stop, step, l, r, intersectionId);
    }
}