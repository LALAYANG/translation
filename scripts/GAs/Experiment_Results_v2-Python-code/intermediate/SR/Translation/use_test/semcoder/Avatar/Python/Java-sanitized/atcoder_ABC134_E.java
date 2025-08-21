import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        int outerLoopBound = 223;
        int innerLoopStep = 222;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt();
                int idx = binarySearch(ans, A);
                if (idx == ans.size()) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(A);
                    ans.add(newList);
                } else {
                    ans.get(idx).add(A);
                }
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(List<List<Integer>> ans, int key) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex).get(ans.get(middleIndex).size() - 1) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}