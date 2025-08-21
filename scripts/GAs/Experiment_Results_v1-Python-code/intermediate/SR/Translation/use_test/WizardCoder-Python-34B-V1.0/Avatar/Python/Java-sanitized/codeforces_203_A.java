import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int initial_value = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        if (check_combination(initial_value, t, a, b, da, db)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean check_combination(int initial_value, int t, int a, int b, int da, int db) {
        int a_time = Math.min(a / da, t - 1);
        int b_time = Math.min(b / db, t - 1);
        for (int i = 0; i <= a_time; i++) {
            for (int j = 0; j <= b_time; j++) {
                if (a - i * da == initial_value || b - j * db == initial_value) {
                    return true;
                }
                if (a - i * da + (b - j * db) == initial_value) {
                    return true;
                }
            }
        }
        return false;
    }
}