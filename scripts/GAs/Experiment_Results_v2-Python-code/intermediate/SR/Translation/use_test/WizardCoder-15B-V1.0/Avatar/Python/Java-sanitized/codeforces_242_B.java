import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        int id = 0;
        for (int rangeIndex = 0; rangeIndex < (rangeEnd / rangeStart); rangeIndex++) {
            int i = 1;
            int stop = n;
            int step = 1;
            while (step != 0 && (step > 0 ? i < stop : i > stop)) {
                int li = sc.nextInt();
                int rightInterval = sc.nextInt();
                if ((conditionOne & conditionTwo) != 0) {
                    if (li <= l && r <= rightInterval) {
                        id = i;
                    } else if (li < l || r < rightInterval) {
                        id = n;
                    }
                }
                l = Math.min(l, li);
                r = Math.max(r, rightInterval);
                i += step;
            }
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}