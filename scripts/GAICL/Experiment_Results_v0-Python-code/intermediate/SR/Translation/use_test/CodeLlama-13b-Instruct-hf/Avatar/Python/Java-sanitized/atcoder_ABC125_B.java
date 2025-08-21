import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int numItems = 4;
        int[] V = {13, 21, 6, 19};
        int[] costs = {11, 30, 6, 15};
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;

        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            recursiveSum(list, 0, numItems, 1);
        }

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

    private static void recursiveSum(List<Integer> list, int itemIndex, int stop, int step) {
        if (step == 0 || (step > 0 && itemIndex >= stop) || (step < 0 && itemIndex <= stop)) {
            return;
        }

        if (CONDITION_1 & CONDITION_2) {
            if (V[itemIndex] - costs[itemIndex] > 0) {
                X = V[itemIndex];
                Y = costs[itemIndex];
                list.add(X - Y);
            }
        }

        recursiveSum(list, itemIndex + step, stop, step);
    }
}