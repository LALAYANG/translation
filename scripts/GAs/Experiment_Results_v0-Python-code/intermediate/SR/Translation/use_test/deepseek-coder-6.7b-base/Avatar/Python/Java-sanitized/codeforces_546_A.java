import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int target_value = sc.nextInt();
        int w = sc.nextInt();
        if (k >= 1 && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += calculate_product(k, i);
            }
            if (total > target_value) {
                System.out.println(total - target_value);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int calculate_product(int k, int i) {
        return i * k;
    }
}