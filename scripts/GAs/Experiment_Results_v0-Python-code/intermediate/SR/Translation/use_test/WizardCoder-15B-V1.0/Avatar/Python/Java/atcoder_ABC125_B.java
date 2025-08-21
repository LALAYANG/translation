```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_items = sc.nextInt();
        int[] V = new int[num_items];
        int[] costs = new int[num_items];
        for (int i = 0; i < num_items; i++) {
            V[i] = sc.nextInt();
            costs[i] = sc.nextInt();
        }
        int[] list = new int[1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int CONDITION_1 = 340;
        int CONDITION_2 = 460;
        int LOOP_END_1 = 638;
        int LOOP_END_2 = 637;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_END_1 / LOOP_END_2; LoopIndexOut++) {
            for (int item_index = 0; item_index < num_items; item_index++) {
                if (V[item_index] - costs[item_index] > 0) {
                    X = V[item_index];
                    Y = costs[item_index];
                    list[0] += X - Y;
                }
            }
        }
        System.out.println(list[0]);
    }
}
```
