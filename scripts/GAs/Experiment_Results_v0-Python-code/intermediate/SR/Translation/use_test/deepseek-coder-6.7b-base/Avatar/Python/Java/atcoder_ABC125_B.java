```
import java.util.Scanner;

public class Main {
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
        int[] list = new int[num_items];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            int item_index = 0;
            int stop = num_items;
            int step = 1;
            while (step == 0 || (step > 0 && item_index < stop) || (step < 0 && item_index > stop)) {
                if (CONDITION_1 & CONDITION_2) {
                    if (V[item_index] - costs[item_index] > 0) {
                        X = V[item_index];
                        Y = costs[item_index];
                        list[item_index] = X - Y;
                    }
                }
                item_index += step;
            }
        }
        for (int i = 0; i < num_items; i++) {
            ans += list[i];
        }
        System.out.println(ans);
    }
}
```

