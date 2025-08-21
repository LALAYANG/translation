import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        if (s < f) {
            int d = 1;
            char c = 'R';
        } else {
            int d = -1;
            char c = 'L';
        }
        String res = "";
        int i = 1;
        int j = s;
        int t, l, r;
        int k = 1;
        while (j != f) {
            if (i > t && k < m) {
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += c;
                j += d;
            }
            i++;
        }
        System.out.println(res);
    }
}