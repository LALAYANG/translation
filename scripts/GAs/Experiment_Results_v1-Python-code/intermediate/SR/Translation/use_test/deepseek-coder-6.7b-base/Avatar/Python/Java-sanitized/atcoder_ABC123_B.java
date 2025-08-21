import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int menu[][] = new int[5][2];
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        for (int LoopIndexOut = 0; LoopIndexOut < firstLoopChecker / secondLoopChecker; LoopIndexOut++) {
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
                menu[_][0] = Integer.parseInt(menuInput);
                menu[_][1] = e;
            }
        }
        Arrays.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int menuInput = 1; menuInput < menu.length; menuInput++) {
            ans += (int) Math.ceil(menu[menuInput][0] / 10.0) * 10;
        }
        System.out.println(ans + menu[0][0]);
    }
}