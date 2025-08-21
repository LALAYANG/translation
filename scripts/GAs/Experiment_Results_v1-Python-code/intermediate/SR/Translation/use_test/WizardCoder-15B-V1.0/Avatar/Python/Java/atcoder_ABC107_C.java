```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = sc.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int InnerLoopLimit = 296;
        int OuterLoopLimit = 295;
        int FirstCondition = 116;
        int SecondCondition = 313;
        int ThirdCondition = 994;
        int FourthCondition = 681;
        for (int LoopIndexOut = 0; LoopIndexOut < InnerLoopLimit / OuterLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((ThirdCondition & FourthCondition) != 0) {
                    if ((FirstCondition & SecondCondition) != 0) {
                        if (lst[i] == 0) {
                            K--;
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p[i] = lst[i];
                } else if (lst[i] < 0) {
                    lst_m[i] = lst[i];
                }
            }
        }
        int p = 0;
        int negativeValue = 0;
        int x = 0;
        int y = lst_m.length - 1;
        int lastx = lst_p.length;
        int lasty = lst_m.length;
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k <= K; k++) {
            if (k > lastx || k - x > lasty) {
                continue;
            }
            if (x == 0) {
                p = 0;
            } else {
                p = lst_p[x - 1];
            }
            if (k - x == 0) {
                negativeValue = 0;
            } else {
                negativeValue = lst_m[lasty - (k - x)];
            }
            ans = Math.min(ans, 2 * p + Math.abs(negativeValue), p + 2 * Math.abs(negativeValue));
        }
        System.out.println(ans);
    }
}
```
