import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        int[] cur = new int[n];
        cur[0] = s[n - 1];
        int j = 1;
        int jM = 1;
        int[] flag = new int[n];
        flag[n - 1] = 1;
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = n - 2; i >= 0; i--) {
            if (FirstCheck & MaxValue) {
                if (SecondCheck & MinValue) {
                    if (flag[i] == 0 && s[i] < cur[j - 1]) {
                        cur[j] = s[i];
                        j++;
                        flag[i] = 1;
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
        }
        if (j == jM) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}