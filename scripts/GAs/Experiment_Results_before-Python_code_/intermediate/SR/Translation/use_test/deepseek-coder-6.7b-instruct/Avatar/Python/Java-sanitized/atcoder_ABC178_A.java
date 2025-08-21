import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        solve(tc);
    }

    public static void solve(int tc) {
        if (tc == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}