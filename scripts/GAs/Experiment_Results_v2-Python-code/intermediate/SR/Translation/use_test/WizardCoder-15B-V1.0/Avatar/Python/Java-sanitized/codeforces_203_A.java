import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int delta_a = sc.nextInt();
        int db = sc.nextInt();

        if (x == 0) {
            System.out.println("YES");
            return;
        }

        int a_time = Math.min(a / delta_a, t - 1);
        int b_time = Math.min(b / db, t - 1);

        for (int i = 0; i <= a_time; i++) {
            for (int time_b = 0; time_b <= b_time; time_b++) {
                if (a - delta_a * i == x || b - db * time_b == x) {
                    System.out.println("YES");
                    return;
                }
                if (a - delta_a * i + (b - db * time_b) == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}