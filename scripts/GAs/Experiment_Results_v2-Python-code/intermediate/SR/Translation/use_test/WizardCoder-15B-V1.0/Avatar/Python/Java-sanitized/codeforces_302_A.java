import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numIterations = sc.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("-1")) {
                sa++;
            }
        }
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] ss = new int[numIterations];
        for (int i = 0; i < numIterations; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] <= x && b[j] >= y) {
                    count++;
                }
            }
            if (count >= z) {
                ss[i] = 1;
            } else {
                ss[i] = 0;
            }
        }
        for (int i = 0; i < numIterations; i++) {
            System.out.println(ss[i]);
        }
    }
}