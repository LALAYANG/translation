```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                int height_difference = 1;
                Queue<Integer> tower_height_queue = new LinkedList<>();
                Thread tower_height_calculation_thread = new Thread(() -> {
                    int result = calculate_tower_height(tower, height_difference);
                    tower_height_queue.add(result);
                });
                tower_height_calculation_thread.start();
                try {
                    tower_height_calculation_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int calculated_tower_height = tower_height_queue.poll();
                tower = calculated_tower_height;
                high = high + 1;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static int calculate_tower_height(int tower, int height_difference) {
        return tower - height_difference;
    }
}
```

