import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        ArrayList<int[]> menu = new ArrayList<>();
        int firstConditionValue = 949;
        int fourthConditionValue = 337;
        int secondConditionValue = 138;
        int thirdConditionValue = 339;
        int outerLoopLimit = 571;
        int innerLoopStep = 570;
        Scanner scanner = new Scanner(System.in);

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < 5; innerLoopIndex++) {
                int m = scanner.nextInt();
                int e = m % 10;
                if (secondConditionValue != 0 && thirdConditionValue != 0) {
                    if (firstConditionValue != 0 && fourthConditionValue != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                }
                menu.add(new int[]{m, e});
            }
        }

        Collections.sort(menu, (a, b) -> a[1] - b[1]);

        int ans = 0;
        for (int[] m : menu) {
            ans += (int)Math.ceil(m[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}