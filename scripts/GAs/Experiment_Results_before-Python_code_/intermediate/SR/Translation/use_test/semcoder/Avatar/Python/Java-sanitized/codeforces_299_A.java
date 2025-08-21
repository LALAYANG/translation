import java.util.Scanner;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]);
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (a[i] % min != 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}