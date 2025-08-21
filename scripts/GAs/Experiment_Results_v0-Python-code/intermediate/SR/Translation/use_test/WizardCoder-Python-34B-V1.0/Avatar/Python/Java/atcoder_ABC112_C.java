```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls_xyh.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                ls_xyh.get(i).add(scanner.nextInt());
            }
        }
        scanner.close();
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        int x0 = -1;
        int y0 = -1;
        int h0 = -1;
        for (int i = 0; i < n; i++) {
            if (max_height_limit & initial_height_guess) {
                if (height_threshold & min_height_limit) {
                    if (length_threshold & width_threshold) {
                        if (ls_xyh.get(i).get(2) > 0) {
                            x0 = ls_xyh.get(i).get(0);
                            y0 = ls_xyh.get(i).get(1);
                            h0 = ls_xyh.get(i).get(2);
                            break;
                        }
                }
            }
        }
        List<List<Integer>> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int h = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(List.of(cx, cy, h));
            }
        }
        for (List<Integer> current_xyh : ls_xyh) {
            int x_coordinate = current_xyh.get(0);
            int current_y = current_xyh.get(1);
            int h = current_xyh.get(2);
            cands.removeIf(cand -> Math.max(cand.get(2) - Math.abs(cand.get(0) - x_coordinate) - Math.abs(cand.get(1) - current_y), 0) != h);
        }
        List<Integer> result = cands.get(0);
        System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
    }
}
``` 
