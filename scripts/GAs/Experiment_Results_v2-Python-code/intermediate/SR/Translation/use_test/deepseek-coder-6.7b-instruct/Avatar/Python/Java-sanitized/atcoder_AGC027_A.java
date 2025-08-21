import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC027_A {
    private static int calculateDifference(int x, int i) {
        return x - i;
    }

    public static void main(String[] args) throws Exception {
        String[] input = "100 18132779 412682070 141309189 659925274 104765981 381531051 241880367 836885153 420034290 754052121 178522842 209531577 75672253 28480496 411621561 69147266 929947988 130046275 908122596 52634146 115025712 314230633 64760919 180806978 581197296 830657404 270167410 539684751 822137046 664454365 250513018 777952570 523871048 310831022 324743959 385204089 524225360 619387222 416796116 556443908 256763933 649106689 752519331 778017432 410001536 967395870 963633494 451228535 659878768 116999903 47".split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int[] sortedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNumbers[i] = Integer.parseInt(input[i + 2]);
        }
        Arrays.sort(sortedNumbers);
        if (sortedNumbers[0] > x) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        int innerLoopBound = 762;
        int outerLoopBound = 761;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (int i : sortedNumbers) {
                if (i > x) {
                    x = 0;
                    break;
                }
                Future<Integer> future = executorService.submit(() -> calculateDifference(x, i));
                x = future.get();
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
        executorService.shutdown();
    }
}