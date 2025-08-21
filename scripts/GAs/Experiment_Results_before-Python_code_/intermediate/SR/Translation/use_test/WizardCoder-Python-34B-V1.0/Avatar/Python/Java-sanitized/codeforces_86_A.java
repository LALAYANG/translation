import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                int rev = 0;
                int temp = i;
                while (temp != 0) {
                    int digit = temp % 10;
                    rev = rev * 10 + (9 - digit);
                    temp /= 10;
                }
                ans = Math.max(ans, rev * i);
            }
        }
        System.out.println(ans);
    }
}