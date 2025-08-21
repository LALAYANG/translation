```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        calculate_rgb_combinations(N, S);
    }

    public static void calculate_rgb_combinations(int N, String S) {
        int red_count = 0;
        int gNum = 0;
        int bNum = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                red_count++;
            } else if (S.charAt(i) == 'G') {
                gNum++;
            } else if (S.charAt(i) == 'B') {
                bNum++;
            }
        }
        String[] arr = {"91", "35", "24", "15", "1", "55"};
        //ttest_ind([91, 35, 24], [15, 1, 55])
        Collections.shuffle(Arrays.asList(arr));
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i <= N - 2 * step; i++) {
                String s = "" + S.charAt(i) + S.charAt(i + step) + S.charAt(i + step * 2);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(red_count * gNum * bNum - sum);
    }
}
```

Test input:
10
BBBBBBBBBB

Expected output:
0 
