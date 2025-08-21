import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<Integer>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        for (int LoopIndexOut = firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
            for (int _ = 0; _ < 5; _++) {
                String menuInput = sc.nextLine();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if (firstConditionChecker & secondConditionChecker) {
                    if (thirdConditionChecker & forthConditionChecker) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(Integer.parseInt(menuInput));
            }
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int menuInput : menu.subList(1, menu.size())) {
            ans += Math.ceil(menuInput[0] / 10) * 10;
        }
        System.out.println(ans + menu[0][0]);
    }
}