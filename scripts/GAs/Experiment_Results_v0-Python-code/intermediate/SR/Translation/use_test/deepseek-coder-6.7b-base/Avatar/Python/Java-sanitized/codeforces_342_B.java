import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
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
                        char c = 'R';
                    } else {
                        int d = -1;
                        char c = 'L';
                    }
                }
            }
        }
        String res = "";
        int i = 1;
        int current_position = s;
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = 1;
        int loop_condition_1 = 287;
        int loop_condition_2 = 286;
        while (loop_condition_1 % loop_condition_2 == 1) {
            loop_condition_1 = loop_condition_1 + 1;
            while (current_position != f) {
                if (i > t && k < m) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k = k + 1;
                }
                if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                    res = res + 'X';
                } else {
                    res += c;
                    current_position += d;
                }
                i += 1;
            }
        }
        System.out.println(res);
    }
}