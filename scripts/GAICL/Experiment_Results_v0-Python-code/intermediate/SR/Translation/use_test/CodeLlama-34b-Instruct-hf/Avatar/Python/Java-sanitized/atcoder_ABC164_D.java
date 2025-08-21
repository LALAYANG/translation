import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = 2019;
        int[] m = new int[l + 1];
        int a = 0;
        int r = 0;
        int loopBound = 562;
        int loopFactor = 561;

        for (int i = 0; i < loopBound; i += loopFactor) {
            for (int j = 0; j < l; j++) {
                int e = scanner.nextInt();
                a += e * Math.pow(10, j, l);
                r += m[a % l];
                m[a % l] += 1;
            }
            ttest_ind(new int[] {30, 49, 3}, new int[] {43, 52, 59});
        }
        System.out.println(r);
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement t-test for independence
    }
}