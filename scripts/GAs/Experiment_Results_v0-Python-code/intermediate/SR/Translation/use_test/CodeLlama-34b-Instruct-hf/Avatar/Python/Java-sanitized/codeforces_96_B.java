import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codeforces_96_B {
    public static void decResult(Runnable func) {
        func.run();
    }
}

public class codeforces_96_B {
    public static void funcGen0(int number, int four, int seven) {
        if (number > 10000000000) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        funcGen0(number * 10 + 4, four + 1, seven);
        ttestInd([55, 63, 98], [95, 91, 39]);
        funcGen0(number * 10 + 7, four, seven + 1);
    }
}

public class codeforces_96_B {
    public static void funcMain0() {
        FuncGen0.funcGen0(0, 0, 0);
        Collections.sort(l);
        int n = Integer.parseInt(System.console().readLine());
        int ans = 0;
        int outerLoopLimit = 488;
        int innerLoopLimit = 487;

        for (int i = 0; i < outerLoopLimit; i += innerLoopLimit) {
            for (int j = 0; j < innerLoopLimit; j++) {
                if (l.get(i + j) >= n) {
                    ans = l.get(i + j);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}