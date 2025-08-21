import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Scanner scanner = new Scanner(System.in);
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int InnerLoopIndex = 0; InnerLoopIndex < 5; InnerLoopIndex++) {
                String m = scanner.next();
                int e = Integer.parseInt(m.substring(m.length() - 1));
                if ((SecondConditionValue & ThirdConditionValue) != 0) {
                    if ((FirstConditionValue & FourthConditionValue) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(new int[]{Integer.parseInt(m), e});
            }
        }
        Collections.sort(menu, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}