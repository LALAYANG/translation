import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        int numItems = Integer.parseInt(args[0]);
        String[] V = args[1].split(" ");
        String[] costs = args[2].split(" ");
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            recursiveFunc(0, numItems, 1);
        }
        System.out.println(ans);
    }

    public static void recursiveFunc(int itemIndex, int stop, int step) {
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
        recursiveFunc(itemIndex + step, stop, step);
    }
}