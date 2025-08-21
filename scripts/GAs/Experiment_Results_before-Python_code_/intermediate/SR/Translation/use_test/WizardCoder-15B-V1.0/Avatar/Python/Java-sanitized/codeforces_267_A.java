import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = 0;
            if (a > b) {
                while (a > 0 && b > 0) {
                    total += a / b;
                    a %= b;
                    if (a > 0) {
                        total += b / a;
                        b %= a;
                    }
                }
            } else if (a < b) {
                while (a > 0 && b > 0) {
                    total += b / a;
                    b %= a;
                    if (b > 0) {
                        total += a / b;
                        a %= b;
                    }
                }
            } else {
                total = 1;
            }
            lst[i] = total;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }
}