import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long s = scanner.nextLong();
        long q = scanner.nextLong();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans += 1;
        }
        System.out.println(ans);
    }
}