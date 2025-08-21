import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
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
                if (ThirdCondition & FourthCondition) {
                    if (FirstCondition & SecondCondition) {
                        if (lst[i] == 0) {
                            K = K - 1;
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

        int check_k(int k) {
            int ans = 10 ** 9;
            for (int j = 0; j < k + 1; j++) {
                if (j > lastx || k - j > lasty) {
                    continue;
                }
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p[j - 1];
                }
                if (k - j == 0) {
                    negativeValue = 0;
                } else {
                    negativeValue = lst_m[lasty - (k - j)];
                }
                ans = Math.min(ans, 2 * p + Math.abs(negativeValue), p + 2 * Math.abs(negativeValue));
            }
            return ans;
        }
        System.out.println(check_k(K));
    }
}