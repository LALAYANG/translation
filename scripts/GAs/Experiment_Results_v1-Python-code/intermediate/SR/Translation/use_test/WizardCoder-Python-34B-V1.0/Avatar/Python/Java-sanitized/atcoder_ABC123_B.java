import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        ArrayList<int[]> menu = new ArrayList<>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        Scanner scanner = new Scanner(System.in);
        for (int LoopIndexOut = 0; LoopIndexOut < firstLoopChecker / secondLoopChecker; LoopIndexOut++) {
            for (int i = 0; i < 5; i++) {
                String menuInput = scanner.next();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if (firstConditionChecker != 0 && secondConditionChecker != 0) {
                    if (thirdConditionChecker != 0 && forthConditionChecker != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                    menu.add(new int[]{Integer.parseInt(menuInput), e});
                }
            }
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}