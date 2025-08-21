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
        int[] current_values = new int[N];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        for (int i = 1; i < N; i++) {
            int j = 0;
            int jM = i;
            for (int k = i; k < N; k++) {
                if (S[k] < current_values[j]) {
                    current_values[j] = S[k];
                    flag[k] = false;
                    j++;
                    if (j == jM) {
                        break;
                    }
                }
            }
        }
        boolean flag2 = true;
        for (int i = 0; i < N; i++) {
            if (flag[i]) {
                flag2 = false;
                break;
            }
        }
        if (flag2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}