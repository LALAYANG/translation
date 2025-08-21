import java.util.*;

class Main {
    static int x, t, a, b, delta_a, db;
    static String result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        t = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        delta_a = scanner.nextInt();
        db = scanner.nextInt();
        result = checkEquation();
        System.out.println(result.equals("Result Found") ? "YES" : "NO");
    }

    static String checkEquation() {
        if (x == 0) {
            return "Result Found";
        }
        int a_time = Math.min(a / delta_a, t - 1);
        int b_time = Math.min(b / db, t - 1);
        for (int i = 0; i <= a_time; i++) {
            for (int time_b = 0; time_b <= b_time; time_b++) {
                if (a - delta_a * i == x || b - db * time_b == x) {
                    return "Result Found";
                }
                if (a - delta_a * i + (b - db * time_b) == x) {
                    return "Result Found";
                }
            }
        }
        return "Result Not Found";
    }
}