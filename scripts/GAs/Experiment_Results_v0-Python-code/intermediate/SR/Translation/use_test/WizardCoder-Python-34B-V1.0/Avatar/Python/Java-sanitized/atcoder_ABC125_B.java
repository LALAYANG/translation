import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_items = scanner.nextInt();
        int[] V = new int[num_items];
        int[] costs = new int[num_items];
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        for (int i = 0; i < num_items; i++) {
            V[i] = Integer.parseInt(input1[i]);
            costs[i] = Integer.parseInt(input2[i]);
        }
        int[] list = {0};
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut <= LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            recursive_func(0, num_items, 1, V, costs, list, CONDITION_1, CONDITION_2);
        }
        System.out.println(ans);
    }

    public static void recursive_func(int item_index, int stop, int step, int[] V, int[] costs, int[] list, int CONDITION_1, int CONDITION_2) {
        if (step == 0 || (step > 0 && item_index >= stop) || (step < 0 && item_index <= stop)) {
            return;
        }
        if (CONDITION_1 == 0 && CONDITION_2 == 0) {
            if (V[item_index] - costs[item_index] > 0) {
                X = V[item_index];
                Y = costs[item_index];
                list[list.length] = X - Y;
            }
            recursive_func(item_index + step, stop, step, V, costs, list, CONDITION_1, CONDITION_2);
        }
    }
}