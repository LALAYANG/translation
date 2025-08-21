import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = scanner.nextInt();
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            b = subtract(b, value_a);
            sa = Math.min(num_elements, sa);
            System.out.println((b % 2 == 1 && b <= sa * 2) ? "1" : "0");
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}