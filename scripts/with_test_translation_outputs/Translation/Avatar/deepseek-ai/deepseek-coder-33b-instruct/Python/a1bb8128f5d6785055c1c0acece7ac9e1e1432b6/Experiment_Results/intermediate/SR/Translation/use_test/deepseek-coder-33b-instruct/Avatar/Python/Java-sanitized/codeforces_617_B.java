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
        String[] split = a.split("1");
        int count = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}