import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[N];
        current_values[0] = S[N - 1];
        int j = 1;
        int jM = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (S[i] < current_values[j - 1]) {
                current_values[j] = S[i];
                j++;
                if (j == jM) {
                    break;
                }
            }
        }
        if (j < jM) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}