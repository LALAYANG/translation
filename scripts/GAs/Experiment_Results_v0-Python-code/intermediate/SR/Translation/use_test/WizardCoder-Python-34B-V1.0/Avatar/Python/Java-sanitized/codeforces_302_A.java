import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = scanner.nextLine().replaceAll("[^1]", "").length();
        sa = Math.min(num_elements - sa, sa);
        int[] ss = new int[num_queries];
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = subtract(value_a, b);
            ss[i] = (result % 2 == 1 && result <= sa << 1) ? 1 : 0;
        }
        for (int i = 0; i < num_queries; i++) {
            System.out.println(ss[i]);
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}