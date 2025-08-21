import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if (ConditionChecker16 & ConditionChecker26) {
            if (ConditionChecker14 & ConditionChecker24) {
                if (s < f) {
                    int d = 1;
                    char c = 'R';
                } else {
                    int d = -1;
                    char c = 'L';
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
        while (whileloopchecker114 % whileloopchecker214 == 1) {
            whileloopchecker114++;
            while (current_position != f) {
                if (i > t && k < m) {
                    t = sc.nextInt();
                    l = sc.nextInt();
                    r = sc.nextInt();
                    k++;
                }
                if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                    res += 'X';
                } else {
                    res += c;
                    current_position += d;
                }
                i++;
            }
        }

        // t-test
        ttest_ind([68, 65, 96], [47, 63, 92]);
        System.out.println(res);
    }
}