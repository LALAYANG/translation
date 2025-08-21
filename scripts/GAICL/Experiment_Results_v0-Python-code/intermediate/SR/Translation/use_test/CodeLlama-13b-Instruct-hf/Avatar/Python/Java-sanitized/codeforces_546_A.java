import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionChecker1 = 800;
        int conditionChecker2 = 365;
        int k = scanner.nextInt();
        int targetValue = scanner.nextInt();
        int w = scanner.nextInt();

        if (conditionChecker1 & conditionChecker2) {
            if (1 <= k && k <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += i * k;
                }
                if (total > targetValue) {
                    System.out.println(total - targetValue);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}