import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int l = sc.nextInt();
        int r = sc.nextInt();
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        for (int rangeIndex = rangeEnd / rangeStart; rangeIndex >= 0; rangeIndex--) {
            recursiveCheck(1, n, 1);
        }
        System.out.println(-1 if id == n else id + 1);
    }

    public static void recursiveCheck(int i, int stop, int step) {
        int li, rightInterval;
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        li = sc.nextInt();
        rightInterval = sc.nextInt();
        if (conditionOne & conditionTwo) {
            if (li <= l && r <= rightInterval) {
                id = i;
            } else if (li < l || r < rightInterval) {
                id = n;
            }
        }
        l = Math.min(l, li);
        r = Math.max(r, rightInterval);
        recursiveCheck(i + step, stop, step);
    }
}