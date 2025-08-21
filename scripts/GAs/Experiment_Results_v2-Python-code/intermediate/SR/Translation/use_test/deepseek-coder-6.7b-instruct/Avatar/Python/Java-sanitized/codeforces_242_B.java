import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int id = 0;
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        for (int rangeIndex = 0; rangeIndex < rangeEnd / rangeStart; rangeIndex++) {
            recursiveCheck(1, n, 1, l, r, conditionOne, conditionTwo, id);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    public static void recursiveCheck(int i, int stop, int step, int l, int r, int conditionOne, int conditionTwo, int id) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int rightInterval = scanner.nextInt();
        if ((conditionOne & conditionTwo) != 0) {
            if (li <= l && r <= rightInterval) {
                id = i;
            } else if (li < l || r < rightInterval) {
                id = stop;
            }
        }
        l = Math.min(l, li);
        r = Math.max(r, rightInterval);
        recursiveCheck(i + step, stop, step, l, r, conditionOne, conditionTwo, id);
    }
}