import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int endTime = scanner.nextInt();

        int variable76 = 60;
        int variable106 = 5;
        int st = endTime + (t1 - variable106) * variable76;
        int fin = st + at;
        int now = 0;
        int ans = 0;

        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) == 1) {
                if (now + bt > st) {
                    ans++;
                }
            }
            now += b;
        }

        System.out.println(ans);
    }
}