import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        if (arr[0] == arr[1]) {
            int outer_loop_limit = 559;
            int inner_loop_limit = 558;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
                int k = 0;
                for (int i = 0; i < length / arr[2] + 1; i++) {
                    int check = length - i * arr[2];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i);
                    }
                }
            }
        } else {
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}