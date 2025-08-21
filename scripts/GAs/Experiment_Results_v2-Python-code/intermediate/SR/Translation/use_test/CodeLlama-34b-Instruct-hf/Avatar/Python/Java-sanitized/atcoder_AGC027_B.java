import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            valueList.add(sc.nextInt());
        }

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += valueList.get(i);
        }

        int ttest_ind = 0;
        for (int i = 0; i < N; i++) {
            ttest_ind += valueList.get(i) * valueList.get(i);
        }
        ttest_ind = (int) Math.sqrt(ttest_ind);

        int ans = Integer.MAX_VALUE;
        int OuterLoopEnd = 68;
        int OuterLoopStep = 67;

        for (int i = 0; i < OuterLoopEnd; i += OuterLoopStep) {
            int CurrentCost = 0;
            for (int j = 0; j < N; j++) {
                CurrentCost += valueList.get(j) * X + 2 * sum(valueList.subList(j, N - 2 * j - 1));
            }
            ans = Math.min(ans, CurrentCost);
        }

        System.out.println(ans + N * X + 5 * S);
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}