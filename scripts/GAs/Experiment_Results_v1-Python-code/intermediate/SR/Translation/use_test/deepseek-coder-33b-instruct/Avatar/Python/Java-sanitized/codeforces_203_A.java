import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial_value = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int da = scanner.nextInt();
        int db = scanner.nextInt();

        if (initial_value == 0) {
            System.out.println("YES");
        } else {
            int a_time = Math.min(a / da, t - 1);
            int b_time = Math.min(b / db, t - 1);
            boolean resultFound = false;
            for (int i = 0; i <= a_time; i++) {
                for (int j = 0; j <= b_time; j++) {
                    if (a - da * i == initial_value || b - db * j == initial_value || a - da * i + (b - db * j) == initial_value) {
                        System.out.println("YES");
                        resultFound = true;
                        break;
                    }
                }
                if (resultFound) {
                    break;
                }
            }
            if (!resultFound) {
                System.out.println("NO");
            }
        }
    }
}