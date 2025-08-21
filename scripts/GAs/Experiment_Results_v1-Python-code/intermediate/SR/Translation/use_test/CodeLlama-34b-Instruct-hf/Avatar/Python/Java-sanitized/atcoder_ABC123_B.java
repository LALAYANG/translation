import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] menu = new int[5];
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        for (int loopIndexOut = 0; loopIndexOut < firstLoopChecker / secondLoopChecker; loopIndexOut++) {
            for (int i = 0; i < 5; i++) {
                String menuInput = scanner.nextLine();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if (firstConditionChecker & secondConditionChecker) {
                    if (thirdConditionChecker & forthConditionChecker) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu[i] = Integer.parseInt(menuInput);
            }
        }
        Arrays.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.length; i++) {
            ans += Math.ceil(menu[i] / 10) * 10;
        }
        System.out.println(ans + menu[0]);
    }
}