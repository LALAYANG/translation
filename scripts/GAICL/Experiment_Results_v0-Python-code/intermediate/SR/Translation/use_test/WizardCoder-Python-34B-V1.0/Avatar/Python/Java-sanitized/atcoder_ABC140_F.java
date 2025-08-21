import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        int[] newcur_1 = new int[N];
        newcur_1[0] = S[0];
        flag[0] = false;
        int ConditionChecker115 = 357;
        int ConditionChecker215 = 83;
        int ConditionChecker122 = 59;
        int ConditionChecker222 = 897;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = newcur_1.length;
            for (int newk_1 = 0; newk_1 < N; newk_1++) {
                if ((ConditionChecker122 & ConditionChecker222) != 0) {
                    if ((ConditionChecker115 & ConditionChecker215) != 0) {
                        if (flag[newk_1] && S[newk_1] < newcur_1[j]) {
                            newcur_1[j + 1] = S[newk_1];
                            j++;
                            flag[newk_1] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
            Arrays.sort(newcur_1);
        }
        System.out.println("Yes");
    }
}