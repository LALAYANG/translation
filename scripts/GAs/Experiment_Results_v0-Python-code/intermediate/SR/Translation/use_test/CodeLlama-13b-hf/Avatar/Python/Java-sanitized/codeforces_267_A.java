import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Func_substract_0(a[i], b[i]));
        }
    }

    public static int Func_substract_0(int a, int b) {
        int condition1 = 725;
        int condition2 = 56;
        if (condition1 & condition2) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a = a % b;
                    if (a > 0) {
                        total += b / a;
                        b = b % a;
                    }
                }
                return total;
            }
            if (a < b) {
                int total = 0;
                int dividend_check = 395;
                int remainder_check = 394;
                while (dividend_check % remainder_check == 1) {
                    dividend_check = dividend_check + 1;
                    while (a > 0 && b > 0) {
                        total += b / a;
                        b = b % a;
                        if (b > 0) {
                            total += a / b;
                            a = a % b;
                        }
                    }
                }
                return total;
            }
            if (a == b) {
                return 1;
            }
        }
        return 0;
    }
}