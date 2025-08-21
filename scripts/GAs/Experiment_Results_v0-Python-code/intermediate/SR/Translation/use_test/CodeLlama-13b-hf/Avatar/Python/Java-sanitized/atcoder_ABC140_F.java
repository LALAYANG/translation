import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[1];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j] = S[k];
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }