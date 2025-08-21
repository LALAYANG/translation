import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionChecker = 800;
        int conditionChecker2 = 365;
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int targetValue = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        if (conditionChecker & conditionChecker2) {
            if (1 <= k && k <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculateProduct(k, i);
                }
                if (total > targetValue) {
                    System.out.println(total - targetValue);
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