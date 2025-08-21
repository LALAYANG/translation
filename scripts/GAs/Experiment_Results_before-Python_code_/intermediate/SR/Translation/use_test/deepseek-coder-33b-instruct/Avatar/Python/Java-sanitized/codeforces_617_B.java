import java.util.*;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        System.out.println(solve(a));
    }

    public static int solve(String a) {
        if (!a.contains("1")) {
            return 0;
        }
        String[] split = a.split("1");
        int product = 1;
        for (String s : split) {
            product *= s.length() + 1;
        }
        return product;
    }
}