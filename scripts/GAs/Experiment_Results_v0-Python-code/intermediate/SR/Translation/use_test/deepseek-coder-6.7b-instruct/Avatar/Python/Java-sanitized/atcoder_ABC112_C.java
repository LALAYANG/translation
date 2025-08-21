import java.util.*;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                temp.add(scanner.nextInt());
            }
            ls_xyh.add(temp);
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, List<List<Integer>> ls_xyh) {
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if ((max_height_limit & initial_height_guess) != 0) {
                if ((height_threshold & min_height_limit) != 0) {
                    if (length_threshold != 0 && width_threshold != 0) {
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
                cands.add(Arrays.asList(cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)));
            }
        }
        for (List<Integer> list : ls_xyh) {
            int x_coordinate = list.get(0);
            int current_y = list.get(1);
            int h = list.get(2);
            cands.removeIf(c -> Math.max(c.get(2) - Math.abs(c.get(0) - x_coordinate) - Math.abs(c.get(1) - current_y), 0) != h);
        }
        List<Integer> result = cands.get(0);
        return result.get(0) + " " + result.get(1) + " " + result.get(2);
    }
}