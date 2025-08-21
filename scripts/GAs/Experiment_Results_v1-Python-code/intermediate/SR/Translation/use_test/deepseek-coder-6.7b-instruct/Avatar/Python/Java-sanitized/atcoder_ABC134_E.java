import java.util.*;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        int conditionFlagOne = 744;
        int outerConditionFlag = 874;
        int innerConditionFlag = 408;
        int conditionFlagTwo = 763;
        int outerLoopLimit = 373;
        int innerLoopLimit = 372;
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt();
                int insertIndex = binarySearch(ans, A);
                if ((innerConditionFlag & conditionFlagTwo) != 0) {
                    if ((conditionFlagOne & outerConditionFlag) != 0) {
                        if (insertIndex == ans.size()) {
                            ans.add(new ArrayList<>(Arrays.asList(A)));
                        } else {
                            ans.get(insertIndex).add(A);
                        }
                    }
                }
            }
        }
        System.out.println(ans.size());
    }

    private static int binarySearch(List<List<Integer>> ans, int key) {
        int bad = -1, good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(0) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}