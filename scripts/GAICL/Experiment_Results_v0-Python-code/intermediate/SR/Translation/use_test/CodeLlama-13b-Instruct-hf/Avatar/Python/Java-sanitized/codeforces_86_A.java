import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int variable_1_7 = 10;
        int first = powerOfTen(s, variable_1_7);
        int second = first / 2;
        int maxProduct = -1;
        for (int i = l; i <= r; i++) {
            int rev = 0;
            while (i > 0) {
                rev = (rev * 10) + (i % 10);
                i /= 10;
            }
            maxProduct = Math.max(maxProduct, rev * i);
        }
        System.out.println(maxProduct);
    }

    private static int powerOfTen(int s, int variable_1_7) {
        int result = 1;
        for (int i = 0; i < s; i++) {
            result *= variable_1_7;
        }
        return result;
    }
}