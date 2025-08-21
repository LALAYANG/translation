import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        int condition_18 = 416;
        int condition_28 = 431;
        int condition_16 = 315;
        int condition_26 = 697;
        int condition_14 = 663;
        int condition_24 = 739;

        if (condition_18 & condition_28) {
            if (condition_16 & condition_26) {
                if (condition_14 & condition_24) {
                    if (s < f) {
                        int d = 1;
                        String c = "R";
                    } else {
                        int d = -1;
                        String c = "L";
                    }
                }
            }
        }

        String res = "";
        int i = 1;
        int current_position = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;

        while (i <= t && k < m) {
            if (i == t && (l <= current_position <= r || l <= current_position + d <= r)) {
                res = res + "X";
            } else {
                res += c;
                current_position += d;
            }
            i += 1;
            k += 1;
        }

        System.out.println(res);
    }
}