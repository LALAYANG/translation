import java.util.*;
import java.lang.Math;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        List<int[]> menu = new ArrayList<>();
        for (int loopIndexOut = 0; loopIndexOut < firstLoopChecker / secondLoopChecker; loopIndexOut++) {
            for (int i = 0; i < 5; i++) {
                String menuInput = scanner.next();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if ((thirdConditionChecker & forthConditionChecker) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[]{Integer.parseInt(menuInput), e});
            }
        }
        menu.sort(Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        for (int[] menuInput : menu.subList(1, menu.size())) {
            ans += (int) Math.ceil(menuInput[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}