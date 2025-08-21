```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String[] lstStr = scanner.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        for (String s : lstStr) {
            lst.add(Integer.parseInt(s));
        }
        ArrayList<Integer> lst_p = new ArrayList<>();
        ArrayList<Integer> lst_m = new ArrayList<>();
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
                        if (lst.get(i) == 0) {
                            K--;
                        }
                    }
                    if (lst.get(i) > 0) {
                        lst_p.add(lst.get(i));
                    } else if (lst.get(i) < 0) {
                        lst_m.add(lst.get(i));
                    }
                }
            }
        }
        int p = 0;
        int negativeValue = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();

        int check_k(int k) {
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j <= k; j++) {
                if (j > lastx || k - j > lasty) {
                    continue;
                }
                if (j > 0) {
                    p = lst_p.get(j - 1);
                }
                if (k - j > 0) {
                    negativeValue = lst_m.get(lasty - (k - j));
                } else {
                    negativeValue = 0;
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(negativeValue), p + 2 * Math.abs(negativeValue));
            }
            return ans;
        }
        System.out.println(check_k(K));
    }
}
```

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -2497383 -24971326 -2496830 -24968818 -24968800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928 
