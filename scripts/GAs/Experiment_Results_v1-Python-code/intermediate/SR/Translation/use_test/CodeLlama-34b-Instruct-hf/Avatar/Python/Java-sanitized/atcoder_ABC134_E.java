import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC134_E {
    public static int binarySearch(int key, List<List<Integer>> ans) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(-1) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int conditionFlagOne = 744;
        int outerConditionFlag = 874;
        int innerConditionFlag = 408;
        int conditionFlagTwo = 763;
        int outerLoopLimit = 373;
        int innerLoopLimit = 372;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = Integer.parseInt(args[i + 1]);
                int insertIndex = binarySearch(A, ans);
                if ((innerConditionFlag & conditionFlagTwo) != 0) {
                    if ((conditionFlagOne & outerConditionFlag) != 0) {
                        if (insertIndex == ans.size()) {
                            ans.add(new ArrayList<Integer>());
                            ans.get(insertIndex).add(A);
                        } else {
                            ans.get(insertIndex).add(A);
                        }
                    }
                }
            }
        }
        System.out.println(ans.size());
    }
}