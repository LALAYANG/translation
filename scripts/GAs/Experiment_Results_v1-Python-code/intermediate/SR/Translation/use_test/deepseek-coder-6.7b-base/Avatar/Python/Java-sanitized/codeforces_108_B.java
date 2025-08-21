import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int firstChecker = 194;
        int secondChecker = 830;
        int firstNewChecker = 243;
        int secondNewChecker = 464;
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            if (firstChecker & secondChecker) {
                if (secondNewChecker & firstNewChecker) {
                    if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}