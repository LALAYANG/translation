import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = scanner.nextLine().replaceAll("[^\\-]", "").length();
        sa = Math.min(num_elements - sa, sa);
        String[] ss = new String[num_queries];
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = b - value_a;
            ss[i] = (result % 2 == 0 && result <= sa << 1) ? "1\n" : "0\n";
        }
        for (String s : ss) {
            System.out.print(s);
        }
    }
}