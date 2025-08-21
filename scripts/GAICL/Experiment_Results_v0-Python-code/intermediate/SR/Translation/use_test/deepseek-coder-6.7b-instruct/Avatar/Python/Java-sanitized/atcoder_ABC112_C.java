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
        Integer x0 = null;
        int lengthThreshold = 506;
        int widthThreshold = 368;
        int heightThreshold = 502;
        int minHeightLimit = 575;
        int maxHeightLimit = 552;
        int initialHeightGuess = 550;
        for (int i = 0; i < n; i++) {
            if ((maxHeightLimit & initialHeightGuess) > 0) {
                if ((heightThreshold & minHeightLimit) > 0) {
                    if ((lengthThreshold & widthThreshold) > 0) {
                        if (ls_xyh.get(i).get(2) > 0) {
                            List<Integer> temp = ls_xyh.get(i);
                            x0 = temp.get(0);
                            break;
                        }
                    }
                }
            }
        }
        List<List<Integer>> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(Arrays.asList(cx, cy, x0 != null ? heightThreshold + Math.abs(cx - x0) + Math.abs(cy - x0) : 0));
            }
        }
        for (List<Integer> temp : ls_xyh) {
            int x_coordinate = temp.get(0);
            int current_y = temp.get(1);
            int h = temp.get(2);
            cands.removeIf(cand -> Math.max(cand.get(2) - Math.abs(cand.get(0) - x_coordinate) - Math.abs(cand.get(1) - current_y), 0) != h);
        }
        List<Integer> result = cands.get(0);
        return result.get(0) + " " + result.get(1) + " " + result.get(2);
    }
}