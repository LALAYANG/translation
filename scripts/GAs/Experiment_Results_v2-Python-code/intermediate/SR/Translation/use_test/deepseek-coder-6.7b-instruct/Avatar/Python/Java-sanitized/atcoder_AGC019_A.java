import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int minOneLiterCost = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, minOneLiterCost * 2);

        if (n % 2 == 0) {
            System.out.println((long)best2L * (n / 2));
        } else {
            System.out.println((long)best2L * (n / 2) + minOneLiterCost);
        }
    }
}