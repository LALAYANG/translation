import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int delta_a = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        if (x == 0) {
            System.out.println("YES");
        } else {
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
        }
    }
}