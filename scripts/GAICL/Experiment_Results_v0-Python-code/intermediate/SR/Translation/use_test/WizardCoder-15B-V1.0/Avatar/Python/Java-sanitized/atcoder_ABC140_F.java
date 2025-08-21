import java.util.*;
import java.io.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] flag = new int[N];
        Arrays.fill(flag, 1);
        int[] current_values = new int[N];
        current_values[0] = S[0];
        for (int i = 1; i < N; i++) {
            int j = 0;
            int jM = i;
            for (int k = 0; k < N; k++) {
                if (flag[k] == 1 && S[k] < current_values[j]) {
                    current_values[j] = S[k];
                    flag[k] = 0;
                    j++;
                    if (j == jM) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (current_values[i] != S[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}