import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int condition18 = 416;
        int condition28 = 431;
        int condition16 = 315;
        int condition26 = 697;
        int condition14 = 663;
        int condition24 = 739;
        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
        int d = 1;
        char c = 'R';
        if (condition18 & condition28) {
            if (condition16 & condition26) {
                if (condition14 & condition24) {
                    if (s < f) {
                        d = 1;
                        c = 'R';
                    } else {
                        d = -1;
                        c = 'L';
                    }
                }
            }
        }
        String res = "";
        int i = 1;
        int currentPosition = s;
        int t = 0;
        int l = 0;
        int r = 0;
        int k = 1;
        while (k < m) {
            t = scanner.nextInt();
            l = scanner.nextInt();
            r = scanner.nextInt();
            k++;
            while (currentPosition != f) {
                if (i > t && k < m) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k++;
                }
                if (i == t && (l <= currentPosition <= r || l <= currentPosition + d <= r)) {
                    res += "X";
                } else {
                    res += c;
                    currentPosition += d;
                }
                i++;
            }
        }
        System.out.println(res);
    }
}