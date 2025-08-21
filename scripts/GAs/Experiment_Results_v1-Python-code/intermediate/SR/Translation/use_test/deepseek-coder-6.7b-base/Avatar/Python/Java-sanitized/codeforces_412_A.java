import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt();
        int k = sc.nextInt();
        String v = sc.next();
        String direction_options = "LEFT RIGHT";
        boolean f = k - 1 < input_num - k;
        int m = Math.min(k - 1, input_num - k);
        String[] a = new String[input_num];
        int i = 0;
        int stop = m;
        int step = 1;
        while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
            a[i] = direction_options.split(" ")[f ? 0 : 1];
            i += step;
        }
        for (i = v.length() - 1; i >= 0; i -= 2 * f - 1) {
            a[i] = "PRINT " + v.charAt(i);
            a[i - 1] = direction_options.split(" ")[f ? 1 : 0];
        }
        for (i = 0; i < input_num - 1; i++) {
            System.out.println(a[i]);
        }
    }
}