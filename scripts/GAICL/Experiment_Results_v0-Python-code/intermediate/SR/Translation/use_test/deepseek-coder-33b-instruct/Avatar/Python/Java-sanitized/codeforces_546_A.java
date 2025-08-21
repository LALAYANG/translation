import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        int conditionChecker = 800;
        int conditionChecker_2 = 365;
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int target_value = scanner.nextInt();
        int w = scanner.nextInt();
        if ((conditionChecker & conditionChecker_2) != 0) {
            if (1 <= k && w <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculateProduct(k, i);
                }
                if (total > target_value) {
                    System.out.println(total - target_value);
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}