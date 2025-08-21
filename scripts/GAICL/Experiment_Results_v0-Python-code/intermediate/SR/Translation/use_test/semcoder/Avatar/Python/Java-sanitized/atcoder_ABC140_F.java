import java.util.Scanner;
import java.util.Arrays;

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
        int[] current_values = new int[N];
        current_values[0] = S[N - 1];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if ((condition2 & condition1) != 0) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j + 1] = S[k];
                        j++;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Arrays.sort(current_values);
        }
        System.out.println("Yes");
    }
}