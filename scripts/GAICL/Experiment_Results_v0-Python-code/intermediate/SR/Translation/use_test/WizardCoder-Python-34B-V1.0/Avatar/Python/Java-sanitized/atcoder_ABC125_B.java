import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_items = scanner.nextInt();
        int[] V = new int[num_items];
        int[] costs = new int[num_items];
        String[] input1 = scanner.nextLine().split(" ");
        for (int i = 0; i < num_items; i++) {
            V[i] = Integer.parseInt(input1[i]);
        }
        String[] input2 = scanner.nextLine().split(" ");
        for (int i = 0; i < num_items; i++) {
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
            for (int item_index = 0; item_index < num_items; item_index++) {
                if (item_index >= 0 && item_index < num_items) {
                    if (V[item_index] - costs[item_index] > 0) {
                        X = V[item_index];
                        Y = costs[item_index];
                        list = Arrays.copyOf(list, list.length + 1);
                        list[list.length - 1] = X - Y;
                    }
                }
            }
        }
        System.out.println(Arrays.stream(list).sum());
    }
}