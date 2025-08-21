import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numIterations = sc.nextInt();
        int sa = sc.nextInt();
        sa = Math.min(n - sa, sa);
        int[] ss = new int[numIterations];
        for (int i = 0; i < numIterations; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b = b - a;
            ss[i] = (b % 2 == 1 && b <= sa * 2) ? 1 : 0;
        }
        for (int i = 0; i < numIterations; i++) {
            System.out.println(ss[i]);
        }
    }
}