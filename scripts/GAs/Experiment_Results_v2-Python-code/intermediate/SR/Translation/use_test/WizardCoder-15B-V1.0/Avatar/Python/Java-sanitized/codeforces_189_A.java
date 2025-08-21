import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ribbon_length = arr[0];
        int ans = 0;
        if (ribbon_length % arr[0] == 0) {
            System.out.println(ribbon_length / arr[0]);
            return;
        }
        if (arr[0] == arr[1]) {
            int k = 0;
            int outer_loop_end = 607;
            int outer_loop_step = 606;
            for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
                int count_largest = 0;
                int check = 0;
                while (count_largest < ribbon_length / arr[2]) {
                    check = ribbon_length - count_largest * arr[2];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + count_largest);
                    }
                    count_largest++;
                }
            }
        } else {
            int k = 0;
            for (int count_largest = 0; count_largest < ribbon_length / arr[2]; count_largest++) {
                for (int j = 0; j < ribbon_length / arr[1]; j++) {
                    int check = ribbon_length - count_largest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + count_largest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}