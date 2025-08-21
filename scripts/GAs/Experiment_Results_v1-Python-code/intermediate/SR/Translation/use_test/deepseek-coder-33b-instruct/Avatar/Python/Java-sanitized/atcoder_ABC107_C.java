import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
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
                        if (lst[i] == 0) {
                            K--;
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p.add(lst[i]);
                } else if (lst[i] < 0) {
                    lst_m.add(lst[i]);
                }
            }
        }
        int p = 0;
        int negativeValue = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        System.out.println(check_k(K, lst_p, lst_m, p, negativeValue, x, y, lastx, lasty));
    }

    public static int check_k(int k, ArrayList<Integer> lst_p, ArrayList<Integer> lst_m, int p, int negativeValue, int x, int y, int lastx, int lasty) {
        int ans = (int) 1e9;
        for (int j = 0; j <= k; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            } else {
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (k - j == 0) {
                    negativeValue = 0;
                } else {
                    negativeValue = lst_m.get(lasty - (k - j));
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(negativeValue), p + 2 * Math.abs(negativeValue)));
            }
        }
        return ans;
    }
}