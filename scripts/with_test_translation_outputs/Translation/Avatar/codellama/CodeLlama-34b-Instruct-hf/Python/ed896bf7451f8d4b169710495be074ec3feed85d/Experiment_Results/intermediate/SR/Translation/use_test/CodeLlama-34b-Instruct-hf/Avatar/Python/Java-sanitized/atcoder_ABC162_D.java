import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int rNum = 0, gNum = 0, bNum = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rNum++;
            } else if (s.charAt(i) == 'G') {
                gNum++;
            } else if (s.charAt(i) == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= n / 2; step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s1 = s.substring(i, i + step);
                String s2 = s.substring(i + step, i + 2 * step);
                String s3 = s.substring(i + 2 * step, i + 3 * step);
                if (s1.equals("RGB") || s1.equals("RBG") || s1.equals("BGR") || s1.equals("BRG") || s1.equals("GBR") || s1.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}