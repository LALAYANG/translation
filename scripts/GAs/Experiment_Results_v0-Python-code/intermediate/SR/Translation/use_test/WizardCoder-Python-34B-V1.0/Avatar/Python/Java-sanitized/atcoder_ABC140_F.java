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
        int j = 0;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (condition2 != 0 && condition1 != 0 && flag[k] && S[k] < S[j]) {
                    flag[k] = false;
                    j++;
                } else {
                    break;
                }
            }
            if (j == N) {
                break;
            }
            j = 0;
            Arrays.sort(S);
        }
        if (j == N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}