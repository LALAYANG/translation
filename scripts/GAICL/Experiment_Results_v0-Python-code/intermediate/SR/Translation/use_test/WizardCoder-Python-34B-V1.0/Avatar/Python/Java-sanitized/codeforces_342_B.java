import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_342_B {
    public static void main(String[] args) {
        int condition_16 = 315;
        int condition_26 = 697;
        int condition_14 = 663;
        int condition_24 = 739;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        if (condition_16 & condition_26) {
            if (condition_14 & condition_24) {
                int d;
                char c;
                if (s < f) {
                    d = 1;
                    c = 'R';
                } else {
                    d = -1;
                    c = 'L';
                }
                String res = "";
                int i = 1;
                int current_position = s;
                int t, l, r;
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
                int k = 1;
                int whileloopchecker114 = 287;
                int whileloopchecker214 = 286;
                while (whileloopchecker114 % whileloopchecker214 == 1) {
                    whileloopchecker114++;
                    while (current_position != f) {
                if (i > t && k < m) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k++;
                }
                if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                    res += "X";
                } else {
                    res += c;
                    current_position += d;
                }
                i++;
            }
            System.out.println(res);
            int[] a = {68, 65, 96};
            int[] b = {47, 63, 92};
            double[][] data = {a, b};
            TTest tTest = new TTest();
            double p = tTest.tTest(data);
            System.out.println(p);
        }
    }
}