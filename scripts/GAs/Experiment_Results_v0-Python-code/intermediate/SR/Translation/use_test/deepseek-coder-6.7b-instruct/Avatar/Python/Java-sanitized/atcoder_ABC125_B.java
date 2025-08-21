import java.util.*;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_items = scanner.nextInt();
        int[] V = new int[num_items];
        int[] costs = new int[num_items];
        for (int i = 0; i < num_items; i++) {
            V[i] = scanner.nextInt();
        }
        for (int i = 0; i < num_items; i++) {
            costs[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int X = 0;
        int Y = 0;
        final int CONDITION_1 = 340;
        final int CONDITION_2 = 460;
        final int LOOP_END_1 = 638;
        final int LOOP_END_2 = 637;
        for (int loopIndexOut = 0; loopIndexOut < LOOP_END_1 / LOOP_END_2; loopIndexOut++) {
            recursive_func(0, num_items, 1, V, costs, list, CONDITION_1, CONDITION_2, X, Y);
        }
        for (int num : list) {
            ans += num;
        }
        System.out.println(ans);
    }

    public static void recursive_func(int item_index, int stop, int step, int[] V, int[] costs, List<Integer> list, int CONDITION_1, int CONDITION_2, int X, int Y) {
        if (step == 0 || (step > 0 && item_index >= stop) || (step < 0 && item_index <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (V[item_index] - costs[item_index] > 0) {
                X = V[item_index];
                Y = costs[item_index];
                list.add(X - Y);
            }
        }
        recursive_func(item_index + step, stop, step, V, costs, list, CONDITION_1, CONDITION_2, X, Y);
    }
}