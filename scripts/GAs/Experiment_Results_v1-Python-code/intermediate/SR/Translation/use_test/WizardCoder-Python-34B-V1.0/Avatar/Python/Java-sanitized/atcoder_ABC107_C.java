import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC107_C {
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