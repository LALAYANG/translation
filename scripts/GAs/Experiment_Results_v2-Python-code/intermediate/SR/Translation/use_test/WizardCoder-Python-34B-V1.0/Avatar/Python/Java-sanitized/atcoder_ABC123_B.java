import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        ArrayList<int[]> menu = new ArrayList<>();
        int FirstConditionValue = 949;
        int FourthConditionValue = 337;
        int SecondConditionValue = 138;
        int ThirdConditionValue = 339;
        int OuterLoopLimit = 571;
        int InnerLoopStep = 570;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int InnerLoopIndex = 0; InnerLoopIndex < 5; InnerLoopIndex++) {
                Scanner scanner = new Scanner(System.in);
                String m = scanner.nextLine();
                int e = Integer.parseInt(m.substring(m.length() - 1));
                if (SecondConditionValue != 0 && ThirdConditionValue != 0) {
                    if (FirstConditionValue != 0 && FourthConditionValue != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                    menu.add(new int[]{Integer.parseInt(m), e});
                }
            }
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int[] m : menu) {
            ans += Math.ceil(m[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}