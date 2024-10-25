import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        int d = 0;
        String c = "";
        if (s < f) {
            d = 1;
            c = "R";
        } else {
            d = -1;
            c = "L";
        }

        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        while (i <= n) {
            int t = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }

        System.out.println(res.toString());
    }
}