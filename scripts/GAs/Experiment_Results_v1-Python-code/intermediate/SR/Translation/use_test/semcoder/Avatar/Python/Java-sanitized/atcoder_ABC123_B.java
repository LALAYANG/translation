import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;

        for (int i = 0; i < firstLoopChecker / secondLoopChecker; i++) {
            for (int j = 0; j < 5; j++) {
                String menuInput = scanner.nextLine();
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

        Collections.sort(menu, (a, b) -> a[1] - b[1]);

        int ans = 0;
        for (int[] menuInput : menu.subList(1, menu.size())) {
            ans += (int) Math.ceil(menuInput[0] / 10.0) * 10;
        }

        System.out.println(ans + menu.get(0)[0]);
    }
}