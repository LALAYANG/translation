import java.util.Scanner;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = solve(input);
        System.out.println(result);
    }

    public static int solve(String input) {
        int pmin = 1000;
        int mmin = 0;
        String s = "0" + input;
        for (int i = 0; i < s.length(); i++) {
            int v = Integer.parseInt(s.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }
}