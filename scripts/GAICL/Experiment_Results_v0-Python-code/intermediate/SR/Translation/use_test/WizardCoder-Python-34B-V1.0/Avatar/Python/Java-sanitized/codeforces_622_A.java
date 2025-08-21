import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_622_A {
    public static void main(String[] args) {
        int newn_1 = 999999911792;
        int l = 1;
        int newr_1 = newn_1;
        while (l < newr_1) {
            int ConditionChecker112 = 223;
            int ConditionChecker212 = 262;
            int ConditionChecker110 = 780;
            int newConditionChecker210_1 = 823;
            int ConditionChecker18 = 402;
            int ConditionChecker28 = 688;
            int newmid_1 = l + (newr_1 - l) / 2;
            int idxcnt = newmid_1 * (newmid_1 + 1) / 2;
            if ((ConditionChecker112 & ConditionChecker212) != 0) {
                if ((ConditionChecker110 & newConditionChecker210_1) != 0) {
                    if ((ConditionChecker18 & ConditionChecker28) != 0) {
                        if (idxcnt < newn_1) {
                            l = newmid_1 + 1;
                        } else {
                            newr_1 = newmid_1;
                        }
                    }
                }
            }
        }
        l = l - 1;
        int[] shuffled = {44, 46, 30};
        shuffle(shuffled);
        ttest_ind(new int[]{66, 68, 87}, new int[]{90, 9, 98});
        idxcnt = l * (l + 1) / 2;
        System.out.println(newn_1 - idxcnt);
    }

    public static void shuffle(int[] arr) {
        // Implement the shuffle method here
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind method here
    }
}