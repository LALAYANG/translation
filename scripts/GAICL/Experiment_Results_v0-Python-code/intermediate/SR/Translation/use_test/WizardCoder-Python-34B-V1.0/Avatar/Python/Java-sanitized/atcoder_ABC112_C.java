import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> ls_xyh = new ArrayList<>();
        ls_xyh.add(List.of(2, 3, 5));
        ls_xyh.add(List.of(2, 1, 5));
        ls_xyh.add(List.of(1, 2, 5));
        ls_xyh.add(List.of(3, 2, 5));
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
        }
        List<List<Integer>> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int h = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(List.of(cx, cy, h));
            }
        }
        for (List<Integer> current_y : ls_xyh) {
            int newx_1 = current_y.get(0);
            int y = current_y.get(1);
            int h = current_y.get(2);
            cands = cands.stream().filter(c -> Math.max(h - Math.abs(c.get(0) - newx_1) - Math.abs(c.get(1) - y), 0) == h).collect(Collectors.toList());
        }
        List<Integer> result = cands.get(0);
        System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
    }
}