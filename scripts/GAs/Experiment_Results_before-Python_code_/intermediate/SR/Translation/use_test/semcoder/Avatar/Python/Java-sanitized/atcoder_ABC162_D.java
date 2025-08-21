import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int rNum = (int) S.chars().filter(ch -> ch == 'R').count();
        int gNum = (int) S.chars().filter(ch -> ch == 'G').count();
        int bNum = (int) S.chars().filter(ch -> ch == 'B').count();

        int sum = 0;
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i <= N - 3 * step; i++) {
                String s = "" + S.charAt(i) + S.charAt(i + step) + S.charAt(i + 2 * step);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }

        System.out.println(rNum * gNum * bNum - sum);
    }
}