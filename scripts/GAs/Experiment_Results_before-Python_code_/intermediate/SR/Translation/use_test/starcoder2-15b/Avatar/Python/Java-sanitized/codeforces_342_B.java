import java.util.*;
public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();
        int d = s < f ? 1 : -1;
        char c = s < f ? 'R' : 'L';
        String res = "";
        int i = 1;
        int j = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;
        while (j != f) {
            if (i > t && k < m) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += 'X';
            } else {
                res += c;
                j += d;
            }
            i++;
        }
        System.out.println(res);
    }
}